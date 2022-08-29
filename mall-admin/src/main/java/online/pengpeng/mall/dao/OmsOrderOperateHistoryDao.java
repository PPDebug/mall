package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.OmsOrderOperateHistory;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 订单操作记录自定义Dao
 *
 * @author pengpeng
 * @date 2022/8/29
 */
public interface OmsOrderOperateHistoryDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
