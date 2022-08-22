package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.PmsProduct;

import java.math.BigDecimal;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 秒杀信息和商品对象封装
 */
@Data
public class FlashPromotionProduct extends PmsProduct {
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
