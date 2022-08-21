package online.pengpeng.mall.portal.dao;

import online.pengpeng.mall.model.SmsCoupon;
import online.pengpeng.mall.portal.domain.CartProduct;
import online.pengpeng.mall.portal.domain.PromotionProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 前台系统自定义商品Dao
 */
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId")Long productCategoryId);
}
