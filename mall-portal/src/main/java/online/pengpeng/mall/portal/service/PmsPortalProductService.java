package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.portal.domain.PmsPortalProductDetail;
import online.pengpeng.mall.portal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 前台商品查询
 */
public interface PmsPortalProductService {
    /**
     * 综合搜索商品
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    PmsPortalProductDetail detail(Long id);
}
