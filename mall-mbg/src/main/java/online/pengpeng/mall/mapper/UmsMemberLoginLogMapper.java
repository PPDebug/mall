package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.UmsMemberLoginLog;
import online.pengpeng.mall.model.UmsMemberLoginLogExample;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginLogMapper {
    long countByExample(UmsMemberLoginLogExample example);

    int deleteByExample(UmsMemberLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog row);

    int insertSelective(UmsMemberLoginLog row);

    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberLoginLog row, @Param("example") UmsMemberLoginLogExample example);

    int updateByExample(@Param("row") UmsMemberLoginLog row, @Param("example") UmsMemberLoginLogExample example);

    int updateByPrimaryKeySelective(UmsMemberLoginLog row);

    int updateByPrimaryKey(UmsMemberLoginLog row);
}