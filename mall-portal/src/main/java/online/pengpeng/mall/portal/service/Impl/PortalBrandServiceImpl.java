package online.pengpeng.mall.portal.service.Impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.mapper.PmsBrandMapper;
import online.pengpeng.mall.mapper.PmsProductMapper;
import online.pengpeng.mall.model.PmsBrand;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.PmsProductExample;
import online.pengpeng.mall.portal.dao.HomeDao;
import online.pengpeng.mall.portal.service.PortalBrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 */
@Service
@AllArgsConstructor
public class PortalBrandServiceImpl implements PortalBrandService {
    private final PmsBrandMapper brandMapper;
    private final PmsProductMapper productMapper;
    private final HomeDao homeDao;


    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return homeDao.getRecommendBrandList(offset, pageSize);
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andDeleteStatusEqualTo(0)
                .andBrandIdEqualTo(brandId);
        List<PmsProduct> productList = productMapper.selectByExample(example);
        return CommonPage.restPage(productList);
    }
}
