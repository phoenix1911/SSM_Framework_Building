package com.jialong.security.controller;

import com.jialong.security.bean.RoleResource;
import com.jialong.security.service.RoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Tjl on 2019/4/2 17:17.
 */
@Controller
@RequestMapping("roleresource")
public class RoleResourceController {
    @Autowired
    private RoleResourceService resourceService;

    @RequestMapping("/all")
    public String selectAll(Model model) {
        List<RoleResource> roleResources = resourceService.selectAll();
        model.addAttribute("rr", roleResources);
        return "admin_roleresource";
    }
}
