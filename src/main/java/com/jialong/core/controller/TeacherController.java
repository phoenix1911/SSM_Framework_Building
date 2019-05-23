package com.jialong.core.controller;

import com.jialong.core.bean.*;
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
@RequestMapping("tea")
public class TeacherController {

    @Autowired
    private BaseService baseService;

    @Autowired
    private TitleService titleService;

    @Autowired
    private TeacherService teacherService;

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
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        Teacher teacher = teacherService.queryById(Integer.parseInt(tid));
        System.out.println(teacher);
        model.addAttribute("teacher", teacher);
        model.addAttribute("tid", tid);

        return "teacher_index";
    }

    @RequestMapping("toIntro")
    public String toIntro(Model model) {
        List<Announcement> adminAnnouncement = announcementService.selectByAnnouncementtype("网站概览");
        List<Announcement> teacherAnnouncement = announcementService.selectByAnnouncementtype("公告");
        model.addAttribute("adminAnnouncement", adminAnnouncement);
        model.addAttribute("teacherAnnouncement", teacherAnnouncement);
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());return "teacher_intro";
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
    public String insertone(@RequestParam("uploadfile") CommonsMultipartFile file, Title title) {

        titleService.uploadrws(file, title);
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
    public String update(@RequestParam("uploadfile") CommonsMultipartFile file, Title title) {

        titleService.uploadrws(file, title);
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        title.setTid(Integer.valueOf(tid));
        titleService.updateTitleAndRWS(title);
        return "redirect:/tea/title/toTitle";
    }



    /**
     * 删除论文
     * @param id
     * @return
     */
    @RequestMapping("/title/del")
    public String delete(@RequestParam("id") int id) {
        //TODO 删除时一起删除文件
        titleService.deleteById(id);
        return "redirect:/tea/title/toTitle";
    }

    @RequestMapping("/title/download")
    public ResponseEntity<byte[]> download(@RequestParam("type") String type,@RequestParam("id") int id) throws IOException {
        Title title = titleService.queryById(id);
        if (("rwstemplate").equals(type)) {
            return baseService.getResponseEntity("\\template\\任务书模板.docx");
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

    /**
     * 教师审批方法
     * @param id
     * @param type
     * @param mark
     * @return
     */
    @RequestMapping("/title/Approval")
    public String approval(@RequestParam("id") int id, @RequestParam("type") String type, @RequestParam("mark") int mark) {
        Title title = titleService.queryById(id);

        if (("ktbg").equals(type)) {
            title.setKtbgstate(mark==1?"审批通过":"审批未通过");
        }
        if (("zqbg").equals(type)) {
            title.setZqbgstate(mark==1?"审批通过":"审批未通过");
        }
        if (("sms").equals(type)) {
            title.setSmsstate(mark==1?"审批通过":"审批未通过");
        }
        titleService.updateTitle(title);
        return "redirect:/tea/title/toTitle";
    }

    @RequestMapping("/toCommunicate")
    public String toCommunicate(Model model,@RequestParam("sid") int sid) {
        String tid = SecurityContextHolder.getContext().getAuthentication().getName();
        String sessionid = tid+"_"+sid;
        List<Weekly> weeklies = weeklyService.selectWeeklyBySessionid(sessionid);
        model.addAttribute("filepath",filepath);
        model.addAttribute("list", weeklies);
        model.addAttribute("sessionid", sessionid);
        return "teacher_communicate";
    }

    @RequestMapping("/weekly/add")
    public String addWeekly(@RequestParam("uploadfile") CommonsMultipartFile[] files ,
                            @RequestParam("describe") String describe,
                            @RequestParam("sessionid") String sessionid,
                            @RequestParam("scoregrade") String scoregrade,
                            Model model,@RequestParam(value = "week",required = false)String week) {
        Integer tid = Integer.valueOf(SecurityContextHolder.getContext().getAuthentication().getName());
        //获取教师对象
//        Student student = studentService.queryById(sid);
        Teacher teacher = teacherService.queryById(tid);

        Weekly weekly = new Weekly();
        weekly.setTid(tid);
        weekly.setTname(teacher.getTname());
        weekly.setDescribe(describe);
        weekly.setScoregrade(scoregrade);
        weekly.setWeeks(Integer.valueOf(week));

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        weekly.setDate(df.format(day));

        long l = System.currentTimeMillis();
        weekly.setSystemtime(String.valueOf(l));


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

        return "student_weekly";
    }


}
