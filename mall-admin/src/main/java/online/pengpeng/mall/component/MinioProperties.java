package online.pengpeng.mall.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@Data
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {
    private String endpoint;
    private String bucketName;
    private String accessKey;
    private String secretKey;
}
