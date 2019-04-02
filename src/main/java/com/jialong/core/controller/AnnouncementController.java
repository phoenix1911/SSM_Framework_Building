package com.jialong.core.controller;

import com.jialong.core.bean.Announcement;
import com.jialong.core.service.AnnouncementService;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Tjl on 2019/4/1 16:53.
 */
@Controller
@RequestMapping("admin")
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    @Value("#{configProperties['filepath']}")
    private String filepath;

    @Value("#{configProperties['imgpath']}")
    private String imgpath;

    @RequestMapping("/toAnnouncement")
    public String toAnnouncement(Model model) {
        List<Announcement> adminAnnouncement = announcementService.selectByAnnouncementtype("网站概览");
        List<Announcement> teacherAnnouncement = announcementService.selectByAnnouncementtype("公告");

        model.addAttribute("adminAnnouncement", adminAnnouncement);
        model.addAttribute("teacherAnnouncement", teacherAnnouncement);
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_Announcement";
    }

    @RequestMapping("/announcement/toAdd")
    public String toAdd(Model model) {
        return "admin_Announcement_add";
    }

    @RequestMapping("/announcement/add")
    public String add(@RequestParam("uploadfile") CommonsMultipartFile[] files, @RequestParam("title") String title, @RequestParam("describe") String describe, @RequestParam("usertype") String usertype) {
        Announcement announcement = new Announcement();
        announcement.setUsertype(usertype);
        announcement.setTitle(title);
        announcement.setDescribe(describe);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        announcement.setDate(df.format(new Date()));

        announcement.setSystemtime(String.valueOf(System.currentTimeMillis()));



            announcement.setAnnouncementtype("公告");
            if (files!=null) {
                for (int i=0;i<files.length;i++) {
                    //获取文件类型
                    String contentType = files[i].getContentType();
                    String[] split = contentType.split("/");
                    if ("image".equals(split[0])) {
                        announcement.setIncludepic(1);
                        String filename = System.currentTimeMillis() + files[i].getOriginalFilename();
                        String path = imgpath + "\\announcement\\" + filename;// 存放位置
                        if (i == 0) { announcement.setP1("\\announcement\\" + filename); }
                        if (i == 1) { announcement.setP2("\\announcement\\" + filename); }
                        if (i == 2) { announcement.setP3("\\announcement\\" + filename); }
                        if (i == 3) { announcement.setP4("\\announcement\\" + filename); }
                        if (i == 4) { announcement.setP5("\\announcement\\" + filename); }
                        File destFile = new File(path);

                        try {
                            FileUtils.copyInputStreamToFile(files[i].getInputStream(), destFile);// 复制临时文件到指定目录下
                        } catch (IOException e) { e.printStackTrace(); }
                    } else {

                        String filename = System.currentTimeMillis() + files[i].getOriginalFilename();
                        String path = filepath+ "\\announcement\\" + filename;// 存放位置
                        File destFile = new File(path);
                        announcement.setIncludefile(1);
                        if (i == 0) { announcement.setF1("\\announcement\\" + filename); }
                        if (i == 1) { announcement.setF2("\\announcement\\" + filename); }
                        if (i == 2) { announcement.setF3("\\announcement\\" + filename); }
                        if (i == 3) { announcement.setF4("\\announcement\\" + filename); }

                        try {
                            FileUtils.copyInputStreamToFile(files[i].getInputStream(), destFile);// 复制临时文件到指定目录下
                        } catch (IOException e) { e.printStackTrace(); }
                    }
                }
            }

        announcementService.add(announcement);
        return "admin_Announcement_add";
    }

    @RequestMapping("/announcement/addwzgl")
    public String addwzgl(@RequestParam("title") String title, @RequestParam("describe") String describe) {
        Announcement announcement = new Announcement();
        announcement.setUsertype("admin");
        announcement.setTitle(title);
        announcement.setDescribe(describe);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        announcement.setDate(df.format(new Date()));

        announcement.setSystemtime(String.valueOf(System.currentTimeMillis()));

        announcement.setIncludepic(0);
        announcement.setAnnouncementtype("网站概览");
        announcement.setIncludefile(0);
        announcementService.add(announcement);
        return "admin_Announcement_add";
    }

    @RequestMapping("/announcement/del")
    public String del(@RequestParam("id") String id,Model model){
        int del = announcementService.del(id);
        if (del == 1) {
            model.addAttribute("message", "删除成功");
        } else {
            model.addAttribute("message", "删除失败");
        }
        return "redirect:/admin/toAnnouncement";
    }

}
