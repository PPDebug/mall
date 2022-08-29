package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsProductCategoryAttributeRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义商品和属性管理dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
