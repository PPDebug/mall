package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsProductLadder;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义会员价格梯度价格Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductLadderDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
