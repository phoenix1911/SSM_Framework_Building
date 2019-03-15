package com.jialong.testMapper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jialong.testMapper.bean.Student;
import com.jialong.testMapper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tjl on 2019/3/15 13:51.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/testMapper")
    @ResponseBody
    public Map<String, Student> testMapper() {
        List<Student> students = studentService.selectAll();
        System.out.println("******************"+students);
        Map<String, Student> map = new HashMap<>();
        map.put(students.get(0).getId().toString(), students.get(0));
        map.put(students.get(1).getId().toString(), students.get(1));
        return map;
    }

    @RequestMapping("/allStudent")
    public String list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 10);

        List<Student> students = studentService.selectAll();

        PageInfo<Student> pageInfo = new PageInfo<>(students, 5);

        model.addAttribute("list", students);
        model.addAttribute("page",pageInfo);
        return "allStudent";
    }

}
