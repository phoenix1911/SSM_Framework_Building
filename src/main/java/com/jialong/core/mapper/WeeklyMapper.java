package com.jialong.core.mapper;

import com.jialong.core.bean.Weekly;
import com.jialong.core.bean.WeeklyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeeklyMapper {
    int countByExample(WeeklyExample example);

    int deleteByExample(WeeklyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Weekly record);

    int insertSelective(Weekly record);

    List<Weekly> selectByExample(WeeklyExample example);

    List<Weekly> selectBySessionid(String session);

    Weekly selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Weekly record, @Param("example") WeeklyExample example);

    int updateByExample(@Param("record") Weekly record, @Param("example") WeeklyExample example);

    int updateByPrimaryKeySelective(Weekly record);

    int updateByPrimaryKey(Weekly record);
}