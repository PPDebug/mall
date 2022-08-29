package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.PmsProductCategory;

import java.util.List;

/**
 * 聚合了商品子分类属性
 * @author pengpeng
 * @date 2022/8/28
 */
@Data
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory{
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}
