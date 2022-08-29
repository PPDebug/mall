package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsProductFullReduction;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义商品满减Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductFullReductionDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
