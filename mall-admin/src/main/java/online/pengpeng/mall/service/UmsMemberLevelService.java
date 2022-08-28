package online.pengpeng.mall.service;

import online.pengpeng.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
