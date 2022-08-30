package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 文件上传返回结果
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
@Builder
public class MinioUploadDto {
    @ApiModelProperty("文件访问URL")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
