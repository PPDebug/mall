package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsProductVertifyRecord;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义商品审核日志管理
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductVerifyRecordDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
