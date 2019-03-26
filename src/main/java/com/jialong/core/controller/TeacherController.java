package com.jialong.core.controller;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.Title;
import com.jialong.core.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Tjl on 2019/3/26 11:12.
 */
@Controller
@RequestMapping("tea")
public class TeacherController {
    @Autowired
    private TitleService titleService;

    @RequestMapping("toIndex")
    public String toIndex(Model model) {
        model.addAttribute("tid", SecurityContextHolder.getContext().getAuthentication().getName());
        //TODO 获取教师姓名
        return "teacher_index";
    }

    @RequestMapping("toIntro")
    public String toIntro(Model model) {
        model.addAttribute("tid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "teacher_intro";
    }

    /**
     * 跳转至所有论文题目信息页面
     * @param model
     * @return
     */
    @RequestMapping("/title/toTitle")
    public String toTitle(Model model) {
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        List<Title> titleList = titleService.queryByTid(Integer.parseInt(tid));
        model.addAttribute("tid", tid);
        model.addAttribute("list", titleList);
        return "teacher_title";
    }

    @RequestMapping("/title/toAdd")
    public String toAdd(Model model) {
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("tid", tid);
        return "teacher_title_add";
    }

    @RequestMapping("/title/add")
    public String insertone(Title title) {
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        title.setTid(Integer.valueOf(tid));
        titleService.insert(title);
        return "redirect:/tea/title/toTitle";
    }

    /**
     * 跳转至更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/title/toUpdate")
    public String toUpdate(Model model, int id) {
        model.addAttribute("title", titleService.queryById(id));
        return "teacher_title_update";
    }

    @RequestMapping("/title/update")
    public String update(Model model, Title title) {
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        title.setTid(Integer.valueOf(tid));
        titleService.update(title);
        return "redirect:/tea/title/toTitle";
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping("/title/del")
    public String delete(@RequestParam("id") int id) {
        titleService.deleteById(id);
        return "redirect:/tea/title/toTitle";
    }
}
