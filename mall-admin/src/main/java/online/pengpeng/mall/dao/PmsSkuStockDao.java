package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsSkuStock;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义商品SKU管理Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsSkuStockDao {
    /**
     * 批量插入操作
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list")List<PmsSkuStock> skuStockList);
}
