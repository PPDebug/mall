package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.SmsCouponProductRelation;
import online.pengpeng.mall.model.SmsCouponProductRelationExample;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductRelationMapper {
    long countByExample(SmsCouponProductRelationExample example);

    int deleteByExample(SmsCouponProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation row);

    int insertSelective(SmsCouponProductRelation row);

    List<SmsCouponProductRelation> selectByExample(SmsCouponProductRelationExample example);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsCouponProductRelation row, @Param("example") SmsCouponProductRelationExample example);

    int updateByExample(@Param("row") SmsCouponProductRelation row, @Param("example") SmsCouponProductRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponProductRelation row);

    int updateByPrimaryKey(SmsCouponProductRelation row);
}