package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.PmsMemberPrice;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 会员价格dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
