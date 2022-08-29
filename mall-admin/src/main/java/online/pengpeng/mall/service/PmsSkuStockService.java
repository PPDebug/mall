package online.pengpeng.mall.service;

import online.pengpeng.mall.model.PmsSkuStock;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
