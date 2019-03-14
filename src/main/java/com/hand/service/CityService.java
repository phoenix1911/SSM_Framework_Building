package com.hand.service;

import com.hand.bean.City;

import java.util.List;

/**
 * Created by Tjl on 2018/12/18 15:23.
 */

public interface CityService {
    int addCity(City city);

    int deleteCityById(int id);

    int updateCity(City city);

    City queryById(int id);

    List<City> selectAllCity();

}
