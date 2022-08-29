package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 确认收获提交订单
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class OmsUpdateStatusParam {
    @ApiModelProperty("服务单号")
    private Long id;
    @ApiModelProperty("收货地址关联id")
    private Long companyAddressId;
    @ApiModelProperty("确认退款金额")
    private BigDecimal returnAmount;
    @ApiModelProperty("处理备注")
    private String handleNote;
    @ApiModelProperty("处理人")
    private String handleMan;
    @ApiModelProperty("收货备注")
    private String receiveNote;
    @ApiModelProperty("收货人")
    private String receiveMan;
    @ApiModelProperty("申请状态：1->退货中；2->已完成；3->已拒绝")
    private Integer status;
}
