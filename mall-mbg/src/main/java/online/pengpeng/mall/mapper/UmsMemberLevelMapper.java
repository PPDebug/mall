package online.pengpeng.mall.mapper;

import java.util.List;
import online.pengpeng.mall.model.UmsMemberLevel;
import online.pengpeng.mall.model.UmsMemberLevelExample;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLevelMapper {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel row);

    int insertSelective(UmsMemberLevel row);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByPrimaryKeySelective(UmsMemberLevel row);

    int updateByPrimaryKey(UmsMemberLevel row);
}