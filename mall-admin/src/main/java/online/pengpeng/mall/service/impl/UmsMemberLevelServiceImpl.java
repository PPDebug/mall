package online.pengpeng.mall.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.UmsMemberLevelMapper;
import online.pengpeng.mall.model.UmsMemberLevel;
import online.pengpeng.mall.model.UmsMemberLevelExample;
import online.pengpeng.mall.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@Service
@AllArgsConstructor
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    private final UmsMemberLevelMapper memberLevelMapper;


    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
