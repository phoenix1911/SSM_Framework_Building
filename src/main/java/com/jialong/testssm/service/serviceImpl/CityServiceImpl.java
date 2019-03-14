package com.jialong.testssm.service.serviceImpl;

import com.jialong.testssm.bean.City;
import com.jialong.testssm.mapper.CityMapper;
import com.jialong.testssm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2018/12/18 15:26.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public int addCity(City city) {
        return cityMapper.insert(city);
    }

    @Override
    public int deleteCityById(int id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCity(City city) {
        return cityMapper.updateByPrimaryKey(city);
    }

    @Override
    public City queryById(int id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<City> selectAllCity() { return cityMapper.selectAllCity(); }
}
