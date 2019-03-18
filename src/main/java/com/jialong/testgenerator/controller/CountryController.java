package com.jialong.testgenerator.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jialong.testMapper.bean.Student;
import com.jialong.testgenerator.bean.Country;
import com.jialong.testgenerator.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Tjl on 2019/3/18 10:20.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/allCountry")
    public String list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 10);

        List<Country> countries = countryService.selectAll();

        PageInfo<Country> pageInfo = new PageInfo<>(countries, 5);

        model.addAttribute("list", countries);
        model.addAttribute("page",pageInfo);
        return "allCountry";
    }
}
