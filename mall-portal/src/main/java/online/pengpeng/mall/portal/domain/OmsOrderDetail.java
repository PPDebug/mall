package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.OmsOrder;
import online.pengpeng.mall.model.OmsOrderItem;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 包含订单商品的订单信息
 */
@Data
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;
}
