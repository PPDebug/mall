package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.model.PmsBrand;
import online.pengpeng.mall.model.PmsProduct;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 前台品牌获取
 */
public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
