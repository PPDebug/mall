package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.UmsAdminRoleRelation;
import online.pengpeng.mall.model.UmsResource;
import online.pengpeng.mall.model.UmsRole;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/19
 * 自定义后台用户与角色管理Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
