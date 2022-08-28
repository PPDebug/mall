package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
