package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.model.CmsSubject;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.PmsProductCategory;
import online.pengpeng.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 首页内容管理
 */
public interface HomeService {
    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 获取商品分类
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     * @param cateId 专题分类id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    /**
     * 分页获取人气推荐商品
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 分页获取新品推荐商品
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);
}
