package online.pengpeng.mall.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.CmsPrefrenceAreaMapper;
import online.pengpeng.mall.model.CmsPrefrenceArea;
import online.pengpeng.mall.model.CmsPrefrenceAreaExample;
import online.pengpeng.mall.service.CmsPreferenceAreaService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@Service
@AllArgsConstructor
public class CmsPreferenceAreaServiceImpl implements CmsPreferenceAreaService {
    private final CmsPrefrenceAreaMapper prefrenceAreaMapper;
    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
