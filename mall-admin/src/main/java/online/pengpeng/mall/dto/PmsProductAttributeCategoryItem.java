package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.PmsProductAttribute;
import online.pengpeng.mall.model.PmsProductCategory;

import java.util.List;

/**
 * 聚合了分类子属性的分类封装
 * @author pengpeng
 * @date 2022/8/28
 */
@Data
public class PmsProductAttributeCategoryItem extends PmsProductCategory {
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
