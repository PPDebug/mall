package online.pengpeng.mall.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Minio Bucket访问策略配置
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
@Builder
public class BucketPolicyConfigDto {
    private String version;
    private List<Statement> statements;

    @Data
    @Builder
    public static class Statement {
        private String Effect;
        private String Principal;
        private String Action;
        private String Resource;
    }
}
