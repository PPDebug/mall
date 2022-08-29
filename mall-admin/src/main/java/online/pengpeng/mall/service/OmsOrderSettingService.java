package online.pengpeng.mall.service;

import online.pengpeng.mall.model.OmsOrderSetting;

/**
 * 订单设置管理
 *
 * @author pengpeng
 * @date 2022/8/29
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
