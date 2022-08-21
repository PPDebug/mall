package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.CmsMemberReport;
import online.pengpeng.mall.model.CmsMemberReportExample;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int insert(CmsMemberReport row);

    int insertSelective(CmsMemberReport row);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("row") CmsMemberReport row, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("row") CmsMemberReport row, @Param("example") CmsMemberReportExample example);
}