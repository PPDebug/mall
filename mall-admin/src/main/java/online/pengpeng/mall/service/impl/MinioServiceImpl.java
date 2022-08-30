package online.pengpeng.mall.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import io.minio.*;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.common.exception.Asserts;
import online.pengpeng.mall.component.MinioProperties;
import online.pengpeng.mall.dto.BucketPolicyConfigDto;
import online.pengpeng.mall.dto.MinioUploadDto;
import online.pengpeng.mall.service.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pengpeng
 * @date 2022/8/30
 */
@Service
@Slf4j
public class MinioServiceImpl implements MinioService {
    private final MinioProperties minioProperties;
    private final MinioClient minioClient;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    public MinioServiceImpl(MinioProperties minioProperties) {
        this.minioProperties = minioProperties;
        log.debug("Minio Properties: {}", minioProperties);
        // 创建一个MinIO的Java客户端
        this.minioClient = MinioClient.builder()
                .endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
    }

    @PostConstruct
    public void initMallBucket() {
        try {
            // 判断捅是否存在
            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket(minioProperties.getBucketName()).build());
            if (isExist) {
                log.debug("存储桶{}已经存在！", minioProperties.getBucketName());
            } else {
                //创建存储桶
                log.info("存储桶不存在, 开始创建存储桶");
                minioClient.makeBucket(MakeBucketArgs.builder()
                        .bucket(minioProperties.getBucketName())
                        .build());
                // 设置只读权限
                SetBucketPolicyArgs bucketPolicyArgs = SetBucketPolicyArgs.builder()
                        .bucket(minioProperties.getBucketName())
                        .config(JSONUtil.toJsonStr(createBucketPolicyConfigDto(minioProperties.getBucketName())))
                        .build();
                minioClient.setBucketPolicy(bucketPolicyArgs);
                log.info("存储桶{}创建成功!", minioProperties.getBucketName());
            }
            log.info("Minio Bucket initial success!");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Minio Bucket initial error -> {}", e.getMessage());
            Asserts.fail(e.getMessage());
        }
    }

    @Override
    public MinioUploadDto uploadFile(MultipartFile file) {
        try {
            String objectName = sdf.format(new Date()) + "/" + file.getOriginalFilename();
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .bucket(minioProperties.getBucketName())
                    .object(objectName)
                    .contentType(file.getContentType())
                    .stream(file.getInputStream(), file.getSize(), ObjectWriteArgs.MIN_MULTIPART_SIZE).build();
            minioClient.putObject(putObjectArgs);
            return MinioUploadDto.builder()
                    .name(file.getOriginalFilename())
                    .url(minioProperties.getEndpoint() + "/" + minioProperties.getBucketName() + "/" + objectName)
                    .build();
        } catch (Exception e) {
            log.warn("上传文件失败");
            Asserts.fail(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteFile(String objectName) {
        try {
            minioClient.removeObject(RemoveObjectArgs.builder()
                    .bucket(minioProperties.getBucketName())
                    .object(objectName)
                    .build()
            );
        } catch (Exception e) {
            e.printStackTrace();
            log.error("删除文件失败: {}", e.getMessage());
            Asserts.fail(e.getMessage());
        }
    }

    private BucketPolicyConfigDto createBucketPolicyConfigDto(String bucketName) {
        BucketPolicyConfigDto.Statement statement = BucketPolicyConfigDto.Statement.builder()
                .Effect("Allow")
                .Principal("*")
                .Action("s3:GetObject")
                .Resource("arn:aws:s3:::" + bucketName + "/*.**").build();
        return BucketPolicyConfigDto.builder()
                .version("2012-10-17")
                .statements(CollUtil.toList(statement))
                .build();
    }
}
