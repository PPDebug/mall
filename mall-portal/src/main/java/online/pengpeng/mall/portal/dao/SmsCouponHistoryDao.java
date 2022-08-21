package online.pengpeng.mall.portal.dao;

import online.pengpeng.mall.model.SmsCoupon;
import online.pengpeng.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 会员优惠卷领取历史自定义
 */
public interface SmsCouponHistoryDao {
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);
    List<SmsCoupon> getCouponList(@Param("memberId") Long memberId, @Param("useStatus")Integer useStatus);
}
