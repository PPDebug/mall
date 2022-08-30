package online.pengpeng.mall.service.impl;

import cn.hutool.json.JSONUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.common.exception.Asserts;
import online.pengpeng.mall.dto.OssCallbackParam;
import online.pengpeng.mall.dto.OssCallbackResult;
import online.pengpeng.mall.dto.OssPolicyResult;
import online.pengpeng.mall.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pengpeng
 * @date 2022/8/30
 */
@Service
@Slf4j
public class OssServiceImpl implements OssService {

    @Value("${aliyun.oss.policy.expire}")
    private int ALIYUN_OSS_EXPIRE;
    @Value("${aliyun.oss.maxSize}")
    private int ALIYUN_OSS_MAX_SIZE;
    @Value("${aliyun.oss.callback}")
    private String ALIYUN_OSS_CALLBACK;
    @Value("${aliyun.oss.bucketName}")
    private String ALIYUN_OSS_BUCKET_NAME;
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    @Value("${aliyun.oss.dir.prefix}")
    private String ALIYUN_OSS_DIR_PREFIX;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private OSSClient ossClient;

    @Override
    public OssPolicyResult policy() {
        // 存储路径
        String dir = ALIYUN_OSS_DIR_PREFIX + sdf.format(new Date());
        // 回调函数参数 base64
        OssCallbackParam callbackParam = OssCallbackParam.builder()
                .callbackUrl(ALIYUN_OSS_CALLBACK)
                .callbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}")
                .callbackBodyType("application.x-www-form-urlencoded")
                .build();
        String callbackData = BinaryUtil.toBase64String(JSONUtil.parse(callbackParam).toString().getBytes(StandardCharsets.UTF_8));
        // 生成有效签名
        Date expiration = new Date(System.currentTimeMillis() + ALIYUN_OSS_EXPIRE * 1000);
        PolicyConditions policyConditions = new PolicyConditions();
        policyConditions.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, ALIYUN_OSS_MAX_SIZE * 1024 * 1024);
        policyConditions.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);
        try {
            String postPolicy = ossClient.generatePostPolicy(expiration, policyConditions);
            String policy = BinaryUtil.toBase64String(postPolicy.getBytes(StandardCharsets.UTF_8));
            String signature = ossClient.calculatePostSignature(postPolicy);
            String accessKeyId = ossClient.getCredentialsProvider().getCredentials().getAccessKeyId();
            return OssPolicyResult.builder()
                    .accessKeyId(accessKeyId)
                    .policy(policy)
                    .signature(signature)
                    .dir(dir)
                    .callback(callbackData)
                    .host("http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            Asserts.fail(e.getMessage());
        }
        return null;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        return OssCallbackResult.builder()
                .filename("http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT + "/" + request.getParameter("filename"))
                .size(request.getParameter("size"))
                .mimeType(request.getParameter("mimeType"))
                .width(request.getParameter("width"))
                .height(request.getParameter("height"))
                .build();
    }
}
