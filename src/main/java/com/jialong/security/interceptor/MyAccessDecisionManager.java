package com.jialong.security.interceptor;

/**
 * Created by Tjl on 2019/3/19 14:45.
 */
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

/**
 * 在这种方法中,需要与configAttributes比较验证
 * 1、一个对象是一个URL,一个过滤器被这个URL找到权限配置,并通过这里
 * 2、如果没有匹配相应的认证,AccessDeniedException
 *
 */
public class MyAccessDecisionManager implements AccessDecisionManager {

    private static final Log logger = LogFactory.getLog(MyAccessDecisionManager.class);

    /**
     * 在这个类中，最重要的是decide方法，如果不存在对该资源的定义，直接放行； 否则，如果找到正确的角色，即认为拥有权限，并放行，否则throw
     * new AccessDeniedException("no right");这样，就会进入上面提到的/accessDenied.jsp页面。
     * @param authentication ：当前用户所且有的角色
     * @param object :当前请求的URL
     * @param configAttributes :当前URL所且有的角色
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
            throws AccessDeniedException, InsufficientAuthenticationException {
        // 资源所需的角色列表，如果角色列表为空，则放行！继续下一个拦截器。
        if (configAttributes == null) {
            return;
        }
        // 即将访问的资源URL,如 : /admin.jsp
        logger.info("即将访问的资源URL :"+object);
        // 遍历所需的角色集合
        Iterator<ConfigAttribute> ite = configAttributes.iterator();
        while (ite.hasNext()) {
            ConfigAttribute ca = ite.next();
            // 该资源所需要的角色
            String needRole = ((SecurityConfig) ca).getAttribute();
            logger.debug("该资源所需要的角色："+needRole);
            // authentication.getAuthorities()获取用户所拥有的角色列表,如：OLE_DEFULT 会一个一个对比有一个符合就能进

            for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
                logger.debug("用户所拥有的角色列表"+authentication.getAuthorities());
                // 将资源所需要的角色与用户拥有的角色比较
                if (needRole.equals(grantedAuthority.getAuthority())) {
                    // 角色相同，直接放行
                    return;
                }
            }
        }
        // 否则，提示没有权限访问该资源
        throw new AccessDeniedException("no right没有访问权限");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) { return true; }

    @Override
    public boolean supports(Class<?> clazz) { return true; }

}
