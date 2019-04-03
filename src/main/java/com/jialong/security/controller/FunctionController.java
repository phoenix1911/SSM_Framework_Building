package com.jialong.security.controller;

import com.jialong.security.bean.RoleResource;
import com.jialong.security.mapper.RoleResourceMapper;
import com.jialong.security.service.RoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Tjl on 2019/4/3 9:59.
 */
@Controller
@RequestMapping("function")
public class FunctionController {

    @Autowired
    private RoleResourceService roleResourceService;

    @RequestMapping("toFunction")
    public String toFunction(Model model) {
        model.addAttribute("sst", roleResourceService.stuSelectTitlefunctionstate());
        return "admin_function";
    }
    /**
     * enabled如果为1 把角色设置为学生 如果为0 把角色设置为0
     * @param enabled
     * @return
     */
    @RequestMapping("stuSelectTitleManage")
    public String stuSelectTitleManage(@RequestParam("enabled") int enabled) {
        roleResourceService.updateStuSelectTitle(enabled);
        return "admin_function";
    }
}
