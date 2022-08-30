package online.pengpeng.mall.service;


import lombok.AllArgsConstructor;
import online.pengpeng.mall.dto.MinioUploadDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * minio管理文件Service
 * @author pengpeng
 * @date 2022/8/30
 */
public interface MinioService {
    /**
     * 文件上传
     */
    public MinioUploadDto uploadFile(MultipartFile file);

    /**
     * 文件删除
     * @param objectName 桶之下的全路径，包括目录
     */
    public void deleteFile(String objectName);

}
