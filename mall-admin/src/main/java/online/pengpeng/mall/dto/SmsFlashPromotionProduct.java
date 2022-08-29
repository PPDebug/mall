package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.PmsProductAttribute;
import online.pengpeng.mall.model.PmsProductAttributeCategory;
import online.pengpeng.mall.model.SmsFlashPromotionProductRelation;

import java.util.List;

/**
 * 限时购买与商品记录： 聚合了相关的商品
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
