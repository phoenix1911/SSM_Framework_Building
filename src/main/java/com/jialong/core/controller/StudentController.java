package com.jialong.core.controller;

import com.jialong.core.bean.Student;
import com.jialong.core.bean.Title;
import com.jialong.core.service.BaseService;
import com.jialong.core.service.StudentService;
import com.jialong.core.service.TitleService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tjl on 2019/3/26 11:12.
 */
@Controller
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private BaseService baseService;

    @Autowired
    private TitleService titleService;

    @Autowired
    private StudentService studentService;

    @Value("#{configProperties['filepath']}")
    private String filepath;

    @RequestMapping("toIndex")
    public String toIndex(Model model) {
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        //TODO 获取教师姓名
        return "student_index";
    }

    @RequestMapping("toIntro")
    public String toIntro(Model model) {
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_intro";
    }

    /**
     * 跳转至论文选择页面
     * @param model
     * @return
     */
    @RequestMapping("/title/toTitleSelect")
    public String toTitleSelect(Model model) {
        List<Title> titleList = titleService.queryNotSelected();
        model.addAttribute("list", titleList);
        return "student_title_select";
    }

    /**
     * 学生选题 修改学生表
     * @param id 论文id
     * @return
     */
    @RequestMapping("/title/TitleSelect")
    public String titleSelect(@RequestParam("id") int id) {
        //修改学生表
        int sid = Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName());
        Student student = studentService.queryById(sid);
        student.setPaperid(id);
        studentService.update(student);
        //修改title表
        Title title = titleService.queryById(id);
        title.setSid(sid);
        titleService.updateTitle(title);

        return "student_title";
    }

    @RequestMapping("/title/toTitle")
    public String toTitle(Model model) {
        String sid = SecurityContextHolder.getContext().getAuthentication().getName();
        Title title = titleService.queryBySid(Integer.parseInt(sid));
        model.addAttribute("tid", sid);
        model.addAttribute("title", title);
        return "student_title";
    }

    @RequestMapping("/title/toUpload")
    public String toAdd(Model model) {
        //获取学生的题目对象
        Title title = titleService.queryBySid(Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));
        model.addAttribute("title", title);
        return "student_title_upload";
    }

    @RequestMapping("/title/upload")
    public String insertone(@RequestParam("uploadfile") CommonsMultipartFile file,@RequestParam("type") String type) {

        //获取学生的题目对象
        Title title = titleService.queryBySid(Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));


        if (!file.isEmpty()) {
            String path = filepath + "\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename();

            if (("ktbg").equals(type)) {
                title.setKtbg("\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename());
                title.setKtbgstate("已上传");
                title.setIsuploadktbg(1);
                File destFile = new File(path);

                try {
                    FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
                } catch (IOException e) { e.printStackTrace(); }
            }
            if (("zqbg").equals(type)) {

                title.setZqbg("\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename());
                title.setZqbgstate("已上传");
                title.setIsuploadzqbg(1);
                File destFile = new File(path);

                try {
                    FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
                } catch (IOException e) { e.printStackTrace(); }

            }

            if (("sms").equals(type)) {
                title.setSms("\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename());
                title.setSmsstate("已上传");
                title.setIsuploadsms(1);
                File destFile = new File(path);

                try {
                    FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
                } catch (IOException e) { e.printStackTrace(); }
            }
        }
        titleService.updateTitle(title);
        return "redirect:/stu/title/toUpload";
    }

    @RequestMapping("/title/download")
    public ResponseEntity<byte[]> download(@RequestParam("type") String type) throws IOException {
        //获取学生的题目对象
        Title title = titleService.queryBySid(Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));

        if (("ktbgtemplate").equals(type)) {
            return baseService.getResponseEntity("\\template\\开题报告模板.docx");
        }
        if (("zqbgtemplate").equals(type)) {
            return baseService.getResponseEntity("\\template\\中期报告模板.docx");
        }
        if (("smstemplate").equals(type)) {
            return baseService.getResponseEntity("\\template\\说明书模板.docx");
        }
        if (("rws").equals(type)) {
            return baseService.getResponseEntity(title.getRws());
        }
        if (("zqbg").equals(type)) {
            return baseService.getResponseEntity(title.getZqbg());
        }
        if (("ktbg").equals(type)) {
            return baseService.getResponseEntity(title.getKtbg());
        }
        if (("sms").equals(type)) {
            return baseService.getResponseEntity(title.getSms());
        }

        return null;


    }

}
