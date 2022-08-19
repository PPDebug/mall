package online.pengpeng.mall.service;

import online.pengpeng.mall.model.UmsAdmin;

/**
 * @author pengpeng
 * @date 2022/8/19
 * 后台用户缓存操作
 */
public interface UmsAdminCacheService {
    /**
     * 删除后台用缓存
     */
    void delAdmin(Long adminId);
    /**
     * 获取缓存后台用户缓存
     */
    UmsAdmin getAdmin(Long adminId);
    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(UmsAdmin admin);
}
