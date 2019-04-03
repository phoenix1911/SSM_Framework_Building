package com.jialong.security.controller;

import com.jialong.core.bean.UserRole;
import com.jialong.security.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Tjl on 2019/4/3 9:28.
 */
@Controller
@RequestMapping("userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @RequestMapping("/all")
    public String all(Model model) {
        List<UserRole> userRoles = userRoleService.selectAll();
        model.addAttribute("ur", userRoles);
        return "admin_userrole";

    }

}
