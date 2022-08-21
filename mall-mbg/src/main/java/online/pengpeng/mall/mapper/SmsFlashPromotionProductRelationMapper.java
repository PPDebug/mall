package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.SmsFlashPromotionProductRelation;
import online.pengpeng.mall.model.SmsFlashPromotionProductRelationExample;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionProductRelationMapper {
    long countByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation row);

    int insertSelective(SmsFlashPromotionProductRelation row);

    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByExample(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation row);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation row);
}