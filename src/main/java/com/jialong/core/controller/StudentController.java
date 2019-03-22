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

    @RequestMapping("allStudent")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {


        List<Student> students = studentService.selectAll();

        model.addAttribute("list", students);
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_v2";
    }

    @RequestMapping("toUpdate")
    public String toUpdateCity(Model model, int id) {
        model.addAttribute("student", studentService.queryById(id));
        return "admin_v2_update";
    }

    @RequestMapping("update")
    public String updateCity(Model model, Student student) {
        studentService.updateCity(student);
        student = studentService.queryById(student.getId());
        model.addAttribute("student", student);
        return "redirect:/admin/student/allStudent";
    }

    @RequestMapping("del")
    public String deleteCity(@RequestParam("id") int id) {
        studentService.deleteCityById(id);
        return "redirect:/admin/student/allStudent";
    }


    /**
     * 下载学生信息模板
     * @param request
     * @param model
     * @return
     * @throws IOException
     */
    @RequestMapping("downloadStuTemplate")
    public ResponseEntity<byte[]> download(HttpServletRequest request, Model model) throws IOException {

        String realPath = request.getSession().getServletContext().getRealPath("/file");
        System.err.println(realPath);
        File file = new File(realPath+"/template/StudentTemplate.xlsx");//新建一个文件

        HttpHeaders headers = new HttpHeaders();//http头信息

        String downloadFileName = new String("学生信息模板.xlsx".getBytes("UTF-8"),"iso-8859-1");//设置编码

        headers.setContentDispositionFormData("attachment", downloadFileName);

        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);

    }




}
