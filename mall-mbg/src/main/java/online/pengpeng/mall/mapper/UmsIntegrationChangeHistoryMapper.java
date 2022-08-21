package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.UmsIntegrationChangeHistory;
import online.pengpeng.mall.model.UmsIntegrationChangeHistoryExample;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationChangeHistoryMapper {
    long countByExample(UmsIntegrationChangeHistoryExample example);

    int deleteByExample(UmsIntegrationChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory row);

    int insertSelective(UmsIntegrationChangeHistory row);

    List<UmsIntegrationChangeHistory> selectByExample(UmsIntegrationChangeHistoryExample example);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsIntegrationChangeHistory row, @Param("example") UmsIntegrationChangeHistoryExample example);

    int updateByExample(@Param("row") UmsIntegrationChangeHistory row, @Param("example") UmsIntegrationChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory row);

    int updateByPrimaryKey(UmsIntegrationChangeHistory row);
}