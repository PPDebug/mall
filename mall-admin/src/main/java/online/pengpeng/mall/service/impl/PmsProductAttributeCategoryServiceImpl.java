package online.pengpeng.mall.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.dao.PmsProductAttributeCategoryDao;
import online.pengpeng.mall.dto.PmsProductAttributeCategoryItem;
import online.pengpeng.mall.mapper.PmsProductAttributeCategoryMapper;
import online.pengpeng.mall.model.PmsProductAttributeCategory;
import online.pengpeng.mall.model.PmsProductAttributeCategoryExample;
import online.pengpeng.mall.service.PmsProductAttributeCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@AllArgsConstructor
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    private final PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    private final PmsProductAttributeCategoryDao productAttributeCategoryDao;


    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);
    }

    @Override
    public int delete(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}
