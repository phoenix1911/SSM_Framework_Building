package com.jialong.security.interceptor;

/**
 * Created by Tjl on 2019/3/19 14:43.
 */
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.jialong.security.bean.Resource;
import com.jialong.security.mapper.ResourceMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

@Component
public class MyFilterSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    private static Logger logger = Logger.getLogger(MyFilterSecurityMetadataSource.class);

    @Autowired
    private ResourceMapper resourceMapper;

    public List<ConfigAttribute> getAttributes(Object object) {
        FilterInvocation fi = (FilterInvocation) object;
        HttpServletRequest request = fi.getRequest();
        String requestUrl = fi.getRequest().getRequestURI();
        List<ConfigAttribute> attributes = new ArrayList<>();


//      查询所有资源所需要的权限并赋值给attributes
        Map<String, String> resRoles = new HashMap<>();
        Resource r = resourceMapper.selectByURL(request.getRequestURI());

        List<String> strings = resourceMapper.selectAuthByRes(r.getUrl());

        String roles = "";
        if (!"".equals(strings)) {
            for (String s:strings) {
                roles = roles + s + ",";
            }
            roles = roles.substring(0, roles.length() - 1);
        }

        resRoles.put(r.getUrl(),roles);

        for (Map.Entry<String, String> ent : resRoles.entrySet()) {
            String url = ent.getKey();
            String role = ent.getValue();
            //根据业务写自己的匹配逻辑
            if(requestUrl.startsWith("/")){
                System.err.println(url+" "+role);
                attributes.addAll(SecurityConfig.createListFromCommaDelimitedString(role));
            }
        }
        logger.debug("【"+request.getRequestURI()+"】 该url对应的角色权限: "+attributes);

        return attributes;
    }


    public Collection<ConfigAttribute> getAllConfigAttributes() { return null; }

    public boolean supports(Class<?> clazz) { return FilterInvocation.class.isAssignableFrom(clazz); }
}