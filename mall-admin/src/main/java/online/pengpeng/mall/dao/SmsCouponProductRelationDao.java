package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.SmsCouponProductRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义优惠卷和商品关系管理Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsCouponProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductRelation> productRelationList);
}
