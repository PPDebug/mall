package online.pengpeng.mall.service;

import online.pengpeng.mall.dto.OmsOrderReturnApplyResult;
import online.pengpeng.mall.dto.OmsReturnApplyQueryParam;
import online.pengpeng.mall.dto.OmsUpdateStatusParam;
import online.pengpeng.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理
 *
 * @author pengpeng
 * @date 2022/8/29
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
