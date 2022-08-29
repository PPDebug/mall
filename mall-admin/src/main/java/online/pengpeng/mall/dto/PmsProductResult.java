package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询单个商品进行修改后返回的结果
 * @author pengpeng
 * @date 2022/8/28
 */
@Data
public class PmsProductResult extends PmsProductParam{
    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;
}
