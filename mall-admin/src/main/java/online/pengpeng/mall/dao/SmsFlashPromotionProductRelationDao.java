package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.SmsFlashPromotionProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义显示购买与商品对应关系管理Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsFlashPromotionProductRelationDao {
    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
