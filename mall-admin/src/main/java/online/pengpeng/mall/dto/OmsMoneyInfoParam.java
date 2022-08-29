package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单费用信息管理参数
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class OmsMoneyInfoParam {
    @ApiModelProperty("订单ID")
    private Long orderId;
    @ApiModelProperty("运费金额")
    private BigDecimal freightAmount;
    @ApiModelProperty("管理员后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;
    @ApiModelProperty("订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;
}
