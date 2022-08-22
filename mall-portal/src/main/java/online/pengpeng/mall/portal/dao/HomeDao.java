package online.pengpeng.mall.portal.dao;

import online.pengpeng.mall.model.CmsSubject;
import online.pengpeng.mall.model.PmsBrand;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.portal.domain.FlashPromotionProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 首页内容管理自定义Dao
 */
public interface HomeDao {
    /**
     * 获取推荐品牌
     */
    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset, @Param("limit") Integer limit);

    /**
     * 获取秒杀商品
     */
    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId, @Param("sessionId") Long sessionId);

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset, @Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);

    /**
     * 获取推荐专题
     */
    List<CmsSubject> getRecommendSubjectList(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
