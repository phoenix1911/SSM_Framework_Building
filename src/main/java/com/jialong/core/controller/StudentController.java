package com.jialong.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jialong.core.bean.Student;
import com.jialong.core.service.StudentService;
import com.jialong.testssm.bean.City;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tjl on 2019/3/22 10:47.
 */
@Controller
@RequestMapping("/admin/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 显示所有学生
     */
    @RequestMapping("allStudent")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("list", students);
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_v2";
    }

    /**
     * 跳转至更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdate(Model model, int id) {
        model.addAttribute("student", studentService.queryById(id));
        return "admin_v2_update";
    }

    /**
     * 处理更新业务逻辑 返回到列表
     * @param model
     * @param student
     * @return
     */
    @RequestMapping("update")
    public String update(Model model, Student student) {
        studentService.update(student);
        student = studentService.queryById(student.getId());
        model.addAttribute("student", student);
        return "redirect:/admin/student/allStudent";
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping("del")
    public String delete(@RequestParam("id") int id) {
        studentService.deleteById(id);
        return "redirect:/admin/student/allStudent";
    }

    @RequestMapping("addone")
    public String insertone(Model model,Student student) {
        studentService.insert(student);
        return "redirect:/admin/student/allStudent";

    }

    /**
     * 下载学生信息模板
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("downloadStuTemplate")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath("/file");
        return studentService.getResponseEntity(realPath);
    }






}
