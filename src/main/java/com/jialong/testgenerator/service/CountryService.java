package com.jialong.testgenerator.service;

import com.jialong.testgenerator.bean.Country;
import com.jialong.testgenerator.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/3/18 10:09.
 */
@Service
public class CountryService {
    @Autowired
    private CountryMapper countryMapper;

    public List<Country> selectAll() {
        return countryMapper.selectAll();

    }

}
