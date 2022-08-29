package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.ProductAttrInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 商品属性Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
