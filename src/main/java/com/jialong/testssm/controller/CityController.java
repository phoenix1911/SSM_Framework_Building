package com.jialong.testssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jialong.testssm.bean.City;
import com.jialong.testssm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tjl on 2018/12/18 15:31.
 */
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/allCity")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {

        PageHelper.startPage(pageNum, 10);

        List<City> cities = cityService.selectAllCity();

        PageInfo<City> page = new PageInfo<>(cities, 9);

        /*
        //导航页 可以遍历得出  第一页 2 3 4 5 6 7 8 9 下一页的效果
        int[] navigatepageNums = page.getNavigatepageNums();
        for (int i : navigatepageNums) {
            System.out.println(i);
        }*/
        model.addAttribute("list", cities);
        model.addAttribute("page", page);
        System.err.println("8888"+SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        return "allCity";
    }

    @RequestMapping("toInsertCity")
    public String toInsertCity() {
        return "insertCity";
    }

    @RequestMapping("/insertCity")
    public String insertCity(City city) {
        cityService.addCity(city);
        return "redirect:/city/allCity";
    }

    @RequestMapping("/del/{id}")
    public String deleteCity(@PathVariable("id") int id) {
        cityService.deleteCityById(id);
        return "redirect:/city/allCity";
    }

    @RequestMapping("toUpdateCity")
    public String toUpdateCity(Model model, int id) {
        model.addAttribute("city", cityService.queryById(id));
        return "updateCity";
    }

    @RequestMapping("/updateCity")
    public String updateCity(Model model, City city) {
        cityService.updateCity(city);
        city = cityService.queryById(city.getId());
        model.addAttribute("city", city);
        return "redirect:/city/allCity";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserList() {
        List<City> list = new ArrayList<>();
        City city = new City();
        city.setId(8888);
        city.setName("taiyuan");
        city.setPopulation(6767878);
        city.setCountrycode("AFG");
        city.setDistrict("a");
        list.add(city);

        City city1 = new City();
        city1.setId(88881);
        city1.setName("taiyuan");
        city1.setPopulation(6767878);
        city1.setCountrycode("AFG");
        city1.setDistrict("a");
        list.add(city1);

        Map<String, Object> map = new HashMap<>();
        map.put("work", "研发");
        map.put("school", "suzhou");
        map.put("list", list);
        return map;
    }


        @RequestMapping(value="/list2")
        public String  getCityInJSON(Model model) {
            City city = new City();
            city.setId(88881);
            city.setName("taiyuan");
            city.setCountrycode("AFG");
            city.setPopulation(6767878);
            city.setDistrict("a");
            Object json = JSONObject.toJSON(city);
            String s = JSON.toJSONString(city);
//            JSON.toJSONString(city)

            model.addAttribute("json", json);
            model.addAttribute("jsonstring", s);
            return "testjson";

        }
    @RequestMapping(value="/list3")
    public String testjson3(Model model) {
        List<City> cities = cityService.selectAllCity();
        //把对象转换成json格式发给前台
        String s = JSON.toJSONString(cities);
        System.out.println(s);
        model.addAttribute("jsonstring", s);

        //模拟:从前台获取json对象传回后台反序列化为对象
        List<JSONObject> list = JSONObject.parseObject(s, List.class);
        System.out.println(list);

        List<City> cityList = new ArrayList<>();
        for (JSONObject jo : list) {
            City city = JSONObject.parseObject(jo.toJSONString(), City.class);
            System.out.println(city);
            cityList.add(city);
        }
        model.addAttribute("citys", cityList);
        return "testjson";


    }


}
