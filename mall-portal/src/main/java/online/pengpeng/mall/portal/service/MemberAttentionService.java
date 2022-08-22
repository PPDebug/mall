package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 用户关注管理
 */
public interface MemberAttentionService {
    /**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long brandId);

    /**
     * 获取用户关注列表
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * 获取用户关注详情
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * 清空关注列表
     */
    void clear();
}
