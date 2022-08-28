package online.pengpeng.mall.portal.dao;

import online.pengpeng.mall.model.OmsOrderItem;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 订单商品信息
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
