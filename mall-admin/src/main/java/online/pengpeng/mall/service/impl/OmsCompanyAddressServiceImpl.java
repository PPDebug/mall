package online.pengpeng.mall.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.OmsCompanyAddressMapper;
import online.pengpeng.mall.model.OmsCompanyAddress;
import online.pengpeng.mall.model.OmsCompanyAddressExample;
import online.pengpeng.mall.service.OmsCompanyAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@AllArgsConstructor
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    private final OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
