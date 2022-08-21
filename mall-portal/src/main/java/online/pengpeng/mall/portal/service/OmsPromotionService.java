package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.model.OmsCartItem;
import online.pengpeng.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 促销管理
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
