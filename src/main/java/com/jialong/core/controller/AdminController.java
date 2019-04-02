package com.jialong.core.controller;

import com.jialong.core.bean.Announcement;
import com.jialong.core.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Tjl on 2019/4/1 16:53.
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AnnouncementService announcementService;

    @RequestMapping("/toAnnouncement")
    public String toAnnouncement(Model model) {
        List<Announcement> adminAnnouncement = announcementService.selectByUsertype("admin");
        List<Announcement> teacherAnnouncement = announcementService.selectByUsertype("teacher");

        model.addAttribute("adminAnnouncement", adminAnnouncement);
        model.addAttribute("teacherAnnouncement", teacherAnnouncement);
        model.addAttribute("sid", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_Announcement";
    }
}
