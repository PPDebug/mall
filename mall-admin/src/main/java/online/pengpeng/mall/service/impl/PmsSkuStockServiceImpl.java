package online.pengpeng.mall.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.dao.PmsSkuStockDao;
import online.pengpeng.mall.mapper.PmsSkuStockMapper;
import online.pengpeng.mall.model.PmsSkuStock;
import online.pengpeng.mall.model.PmsSkuStockExample;
import online.pengpeng.mall.service.PmsSkuStockService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品sku库存管理
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@AllArgsConstructor
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    private final PmsSkuStockMapper skuStockMapper;
    private final PmsSkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }
}
