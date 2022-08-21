package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.OmsCartItem;

import java.math.BigDecimal;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 购物车中单个商品 + 对应的促销活动
 */
@Data
public class CartPromotionItem extends OmsCartItem {
    //促销活动信息
    private String promotionMessage;
    //促销活动减去的金额，针对每个商品
    private BigDecimal reduceAmount;
    //商品的真实库存（剩余库存-锁定库存）
    private Integer realStock;
    //购买商品赠送积分
    private Integer integration;
    //购买商品赠送成长值
    private Integer growth;
}
