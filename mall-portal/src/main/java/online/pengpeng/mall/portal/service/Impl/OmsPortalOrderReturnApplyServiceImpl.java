package online.pengpeng.mall.portal.service.Impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.mapper.*;
import online.pengpeng.mall.portal.component.CancelOrderSender;
import online.pengpeng.mall.portal.config.RedisConfig;
import online.pengpeng.mall.portal.dao.PortalOrderDao;
import online.pengpeng.mall.portal.dao.PortalOrderItemDao;
import online.pengpeng.mall.portal.dao.SmsCouponHistoryDao;
import online.pengpeng.mall.portal.domain.OmsOrderReturnApplyParam;
import online.pengpeng.mall.portal.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@Service
@AllArgsConstructor
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    private final UmsMemberService memberService;
    private final OmsCartItemService cartItemService;
    private final UmsMemberCouponService memberCouponService;
    private final UmsMemberReceiveAddressService memberReceiveAddressService;
    private final UmsIntegrationConsumeSettingMapper integrationConsumeSettingMapper;
    private final PmsSkuStockMapper skuStockMapper;
    private final SmsCouponHistoryDao historyDao;
    private final OmsOrderMapper orderMapper;
    private final PortalOrderItemDao portalOrderItemDao;
    private final RedisConfig redisConfig;
    private final PortalOrderDao portalOrderDao;
    private final OmsOrderSettingMapper orderSettingMapper;
    private final OmsOrderItemMapper orderItemMapper;
    private final CancelOrderSender cancelOrderSender;

    @Value("${redis.key.orderId}")
    private static String REDIS_KEY_ORDER_ID;
    @Value("${redis.database}")
    private static String REDIS_DATABASE;

    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        return 0;
    }
}
