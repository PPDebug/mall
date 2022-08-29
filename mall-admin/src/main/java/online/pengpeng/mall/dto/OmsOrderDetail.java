package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.OmsOrder;
import online.pengpeng.mall.model.OmsOrderItem;
import online.pengpeng.mall.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * 订单详情信息
 * 数据库订单信息聚合订单商品列表、订单操作记录列表
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class OmsOrderDetail extends OmsOrder {
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;
}
