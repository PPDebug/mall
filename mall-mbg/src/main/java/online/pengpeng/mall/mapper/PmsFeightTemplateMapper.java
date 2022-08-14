package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.PmsFeightTemplate;
import online.pengpeng.mall.model.PmsFeightTemplateExample;
import org.apache.ibatis.annotations.Param;

public interface PmsFeightTemplateMapper {
    long countByExample(PmsFeightTemplateExample example);

    int deleteByExample(PmsFeightTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    int updateByExample(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);
}