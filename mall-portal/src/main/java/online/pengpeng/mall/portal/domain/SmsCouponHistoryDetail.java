package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.SmsCoupon;
import online.pengpeng.mall.model.SmsCouponHistory;
import online.pengpeng.mall.model.SmsCouponProductCategoryRelation;
import online.pengpeng.mall.model.SmsCouponProductRelation;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 优惠卷领取历史详情
 */
@Data
public class SmsCouponHistoryDetail extends SmsCouponHistory {
    // 相关优惠券信息
    private SmsCoupon coupon;
    //优惠券关联商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券关联商品分类
    private List<SmsCouponProductCategoryRelation> categoryRelationList;

}
