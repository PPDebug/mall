package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.OmsCompanyAddress;
import online.pengpeng.mall.model.OmsOrderReturnApply;

/**
 * 申请信息封装
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
