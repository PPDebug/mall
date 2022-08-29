package online.pengpeng.mall.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.OmsOrderSettingMapper;
import online.pengpeng.mall.model.OmsOrderSetting;
import online.pengpeng.mall.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@AllArgsConstructor
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    private final OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
