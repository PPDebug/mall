package online.pengpeng.mall.service;

import online.pengpeng.mall.model.SmsCouponHistory;

import java.util.List;

/**
 * 优惠卷领取记录管理
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param useStatus 使用状态
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
