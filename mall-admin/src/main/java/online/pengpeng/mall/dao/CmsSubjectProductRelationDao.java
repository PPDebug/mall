package online.pengpeng.mall.dao;

import online.pengpeng.mall.model.CmsSubjectProductRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作Dao
 * @author pengpeng
 * @date 2022/8/29
 */
public interface CmsSubjectProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
