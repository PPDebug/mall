package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.CmsPrefrenceAreaProductRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义优选和商品关系操作Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface CmsPreferenceAreaProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
