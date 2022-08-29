package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单运输详情参数
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class OmsOrderDeliveryParam {
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;
}
