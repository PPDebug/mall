package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.OmsOrderDeliveryParam;
import online.pengpeng.mall.dto.OmsOrderDetail;
import online.pengpeng.mall.dto.OmsOrderQueryParam;
import online.pengpeng.mall.model.OmsOrder;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 *
 * @author pengpeng
 * @date 2022/8/29
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
