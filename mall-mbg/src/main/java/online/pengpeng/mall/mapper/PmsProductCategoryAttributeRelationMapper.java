package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.PmsProductCategoryAttributeRelation;
import online.pengpeng.mall.model.PmsProductCategoryAttributeRelationExample;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationMapper {
    long countByExample(PmsProductCategoryAttributeRelationExample example);

    int deleteByExample(PmsProductCategoryAttributeRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation row);

    int insertSelective(PmsProductCategoryAttributeRelation row);

    List<PmsProductCategoryAttributeRelation> selectByExample(PmsProductCategoryAttributeRelationExample example);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    int updateByExample(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation row);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation row);
}