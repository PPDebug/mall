package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.model.SmsCoupon;
import online.pengpeng.mall.model.SmsCouponHistory;
import online.pengpeng.mall.portal.domain.CartPromotionItem;
import online.pengpeng.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 用户优惠卷管理
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    void add(Long couponId);

    /**
     * 获取优惠券历史列表
     */
    List<SmsCouponHistory> listHistory(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);

    /**
     * 获取当前商品相关优惠券
     */
    List<SmsCoupon> listByProduct(Long productId);

    /**
     * 获取用户优惠券列表
     */
    List<SmsCoupon> list(Integer useStatus);
}
