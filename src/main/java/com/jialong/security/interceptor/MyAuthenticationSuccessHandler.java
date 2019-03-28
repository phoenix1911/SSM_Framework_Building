package com.jialong.security.interceptor;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * Created by Tjl on 2019/3/20 15:17.
 */
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        String path = request.getContextPath() ;
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        if (roles.contains("ROLE_ADMIN")){
            response.sendRedirect(basePath+"admin_index.jsp");
            return;
        }
        if (roles.contains("ROLE_STUDENT")){
            response.sendRedirect(basePath+"stu/toIndex");
            return;
        }
        if (roles.contains("ROLE_TEACHER")){
            response.sendRedirect(basePath+"tea/toIndex");
            return;
        }
        response.sendRedirect(basePath+"login.html");
    }
}
