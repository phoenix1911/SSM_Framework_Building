package com.jialong.testgenerator.mapper;

import com.jialong.testgenerator.bean.Country;

import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    List<Country> selectAll();

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}