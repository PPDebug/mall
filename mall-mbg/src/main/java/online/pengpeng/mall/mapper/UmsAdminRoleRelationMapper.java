package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.UmsAdminRoleRelation;
import online.pengpeng.mall.model.UmsAdminRoleRelationExample;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRoleRelationMapper {
    long countByExample(UmsAdminRoleRelationExample example);

    int deleteByExample(UmsAdminRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation row);

    int insertSelective(UmsAdminRoleRelation row);

    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsAdminRoleRelation row, @Param("example") UmsAdminRoleRelationExample example);

    int updateByExample(@Param("row") UmsAdminRoleRelation row, @Param("example") UmsAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation row);

    int updateByPrimaryKey(UmsAdminRoleRelation row);
}