package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.SmsCouponProductCategoryRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义优惠卷和商品分类关系管理
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
