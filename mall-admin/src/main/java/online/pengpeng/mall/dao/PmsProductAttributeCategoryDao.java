package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 商品分类Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
