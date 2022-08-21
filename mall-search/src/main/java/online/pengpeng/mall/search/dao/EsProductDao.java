package online.pengpeng.mall.search.dao;

import online.pengpeng.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 搜索上屏管理自定义Dao
 */
public interface EsProductDao {
    /**
     * 获取指定id的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
