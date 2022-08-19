package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.UmsMenu;
import online.pengpeng.mall.model.UmsResource;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/19
 * 自定义后台角色管理Dao
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
