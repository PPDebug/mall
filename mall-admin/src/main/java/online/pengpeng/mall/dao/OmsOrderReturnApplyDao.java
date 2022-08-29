package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.OmsOrderReturnApplyResult;
import online.pengpeng.mall.dto.OmsReturnApplyQueryParam;
import online.pengpeng.mall.model.OmsOrderReturnApply;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 订单退货申请操作自定义Dao
 *
 * @author pengpeng
 * @date 2022/8/29
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
