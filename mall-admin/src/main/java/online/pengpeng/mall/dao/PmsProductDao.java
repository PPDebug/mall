package online.pengpeng.mall.dao;

import online.pengpeng.mall.dto.PmsProductResult;
import org.springframework.data.repository.query.Param;

/**
 * 自定义商品管理Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
