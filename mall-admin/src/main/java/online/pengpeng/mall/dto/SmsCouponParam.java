package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.SmsCoupon;
import online.pengpeng.mall.model.SmsCouponProductCategoryRelation;
import online.pengpeng.mall.model.SmsCouponProductRelation;

import java.util.List;

/**
 * 优惠卷封装类：优惠卷 + 对应的商品 + 对应的分类
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class SmsCouponParam extends SmsCoupon {
    @ApiModelProperty("优惠券绑定的商品")
    private List<SmsCouponProductRelation> productRelationList;
    @ApiModelProperty("优惠券绑定的商品分类")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
