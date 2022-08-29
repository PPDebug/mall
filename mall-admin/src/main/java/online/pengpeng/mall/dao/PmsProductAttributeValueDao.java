package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsProductAttributeValue;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 商品自定义规格属性Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
