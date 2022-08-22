package online.pengpeng.mall.portal.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 首页当前秒杀场次信息
 */
@Data
public class HomeFlashPromotion {
    private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //属于该秒杀活动的商品
    private List<FlashPromotionProduct> productList;
}
