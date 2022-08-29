package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.SmsCouponParam;
import org.springframework.data.repository.query.Param;

/**
 * 自定义优惠卷管理
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
