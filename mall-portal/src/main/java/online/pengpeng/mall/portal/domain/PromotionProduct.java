package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.PmsProductFullReduction;
import online.pengpeng.mall.model.PmsProductLadder;
import online.pengpeng.mall.model.PmsSkuStock;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 商品促销信息，包括：sku、打折优惠、满减优惠
 */
@Data
public class PromotionProduct extends PmsProduct {
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;
}
