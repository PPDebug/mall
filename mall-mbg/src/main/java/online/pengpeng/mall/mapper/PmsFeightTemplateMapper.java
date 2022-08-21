package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.PmsFeightTemplate;
import online.pengpeng.mall.model.PmsFeightTemplateExample;
import org.apache.ibatis.annotations.Param;

public interface PmsFeightTemplateMapper {
    long countByExample(PmsFeightTemplateExample example);

    int deleteByExample(PmsFeightTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate row);

    int insertSelective(PmsFeightTemplate row);

    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsFeightTemplate row, @Param("example") PmsFeightTemplateExample example);

    int updateByExample(@Param("row") PmsFeightTemplate row, @Param("example") PmsFeightTemplateExample example);

    int updateByPrimaryKeySelective(PmsFeightTemplate row);

    int updateByPrimaryKey(PmsFeightTemplate row);
}