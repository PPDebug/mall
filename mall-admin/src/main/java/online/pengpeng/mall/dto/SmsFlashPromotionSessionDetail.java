package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import online.pengpeng.mall.model.SmsFlashPromotionSession;


/**
 * 限时购场次信息（包含商品数量）
 * @author pengpeng
 * @date 2022/8/29
 */
@Data
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @ApiModelProperty("商品数量")
    private Long productCount;
}
