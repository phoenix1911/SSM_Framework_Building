package com.jialong.core.controller;

import com.jialong.core.bean.Announcement;
import com.jialong.core.bean.Student;
import com.jialong.core.bean.Title;
import com.jialong.core.bean.Weekly;
import com.jialong.core.service.*;
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
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Autowired
    private WeeklyService weeklyService;

    @Autowired
    private AnnouncementService announcementService;

    @Value("#{configProperties['filepath']}")
    private String filepath;
    @Value("#{configProperties['imgpath']}")
    private String imgpath;

    @RequestMapping("toIndex")
    public String toIndex(Model model) {
        String sid= SecurityContextHolder.getContext().getAuthentication().getName();
        Student student = studentService.queryById(Integer.parseInt(sid));
        model.addAttribute("student", student);
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_index";
    }


    @RequestMapping("toIntro")
    public String toIntro(Model model) {
        List<Announcement> adminAnnouncement = announcementService.selectByAnnouncementtype("网站概览");
        List<Announcement> teacherAnnouncement = announcementService.selectByAnnouncementtype("公告");
        model.addAttribute("adminAnnouncement", adminAnnouncement);
        model.addAttribute("teacherAnnouncement", teacherAnnouncement);
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_intro";
    }

    @RequestMapping("/weekly/toCalendar")
    public String toCalender(Model model) {
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_weekly_calendar";
    }

    @RequestMapping("/weekly/toTimeline")
    public String toTimeline(Model model) {
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_weekly_timeline";
    }

    @RequestMapping("weekly/toWeekly")
    public String toWeekly(Model model) {
        String sid = SecurityContextHolder.getContext().getAuthentication().getName();
        Student student = studentService.queryById(Integer.parseInt(sid));
        List<Weekly> weeklies = weeklyService.selectWeeklyBySessionid(student.getXntid() + "_" + sid);
        model.addAttribute("list", weeklies);
        return "student_weekly";
    }
    @RequestMapping("/weekly/toAdd")
    public String toAddWeekly(Model model) {
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "student_weekly";
    }

    @RequestMapping("/weekly/add")
    public String addWeekly(@RequestParam("uploadfile") CommonsMultipartFile[] files ,@RequestParam("describe") String describe, Model model) {
        Integer sid = Integer.valueOf(SecurityContextHolder.getContext().getAuthentication().getName());
        //获取学生对象
        Student student = studentService.queryById(sid);

        Weekly weekly = new Weekly();
        weekly.setSid(sid);
        weekly.setSname(student.getName());
        weekly.setDescribe(describe);

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        weekly.setDate(df.format(day));

        long l = System.currentTimeMillis();
        weekly.setSystemtime(String.valueOf(l));

        String sessionid = student.getXntid() + "_" + student.getId();
        weekly.setSessionid(sessionid);

        if (files != null) {
            weekly.setIncludepic(1);
            for (int i = 0; i < files.length; i++) {
                String origipath= "\\weekly\\" + sessionid + "\\" + l + files[i].getOriginalFilename();

                if (i == 0) { weekly.setP1(origipath);}
                if (i == 1) { weekly.setP2(origipath);}
                if (i == 2) { weekly.setP3(origipath);}
                if (i == 3) { weekly.setP4(origipath);}
                if (i == 4) { weekly.setP5(origipath);}
                if (i == 5) { weekly.setP6(origipath);}
                if (i == 6) { weekly.setP7(origipath);}
                if (i == 7) { weekly.setP8(origipath);}
                String path = imgpath + origipath;
                File destFile = new File(path);
                try{
                    //复制文件
                    FileUtils.copyInputStreamToFile(files[i].getInputStream(),destFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        weeklyService.studentAddWeekly(weekly);

        return "student_weekly_add";
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

    /**
     * 上传的时候修改状态为 已上传 无论有没有审批 重新上传时都会再次审批
     * @param file
     * @param type
     * @return
     */
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
