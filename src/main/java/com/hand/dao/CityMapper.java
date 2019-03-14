package com.hand.dao;

import com.hand.bean.City;

import java.util.List;

public interface CityMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(City record);
    //选择性保存数据
    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAllCity();

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}