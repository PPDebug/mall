package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.UmsRoleResourceRelation;
import online.pengpeng.mall.model.UmsRoleResourceRelationExample;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleResourceRelationMapper {
    long countByExample(UmsRoleResourceRelationExample example);

    int deleteByExample(UmsRoleResourceRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleResourceRelation row);

    int insertSelective(UmsRoleResourceRelation row);

    List<UmsRoleResourceRelation> selectByExample(UmsRoleResourceRelationExample example);

    UmsRoleResourceRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsRoleResourceRelation row, @Param("example") UmsRoleResourceRelationExample example);

    int updateByExample(@Param("row") UmsRoleResourceRelation row, @Param("example") UmsRoleResourceRelationExample example);

    int updateByPrimaryKeySelective(UmsRoleResourceRelation row);

    int updateByPrimaryKey(UmsRoleResourceRelation row);
}