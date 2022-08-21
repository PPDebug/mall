package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.PmsProductAttribute;
import online.pengpeng.mall.model.PmsSkuStock;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 商品信息 + 可选规格
 */
@Data
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributes;
    private List<PmsSkuStock> skuStockList;
}
