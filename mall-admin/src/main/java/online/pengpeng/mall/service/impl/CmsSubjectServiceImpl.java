package online.pengpeng.mall.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.CmsSubjectMapper;
import online.pengpeng.mall.model.CmsSubject;
import online.pengpeng.mall.model.CmsSubjectExample;
import online.pengpeng.mall.service.CmsSubjectService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@Service
@AllArgsConstructor
public class CmsSubjectServiceImpl implements CmsSubjectService {
    private final CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
