package com.jialong.security.interceptor;

/**
 * Created by Tjl on 2019/3/19 14:40.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.jialong.security.bean.Users;
import com.jialong.security.mapper.UsersMapper;
import com.jialong.security.service.UsersService;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 从数据库中读入用户的密码，角色信息，是否锁定，账号是否过期等
 *
 */
@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 数据库交互获取用户拥有的权限角色，并设置权限
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        // 根据登录用户名获取用户信息
        Users user = usersMapper.selectByPrimaryKey(username);
        if (null != user) {
//            存放权限
            Collection<GrantedAuthority> auths = new ArrayList<>();
            List<String> strings = usersMapper.selectAuthorityByUsername(username);
            for (String a:strings) {
                SimpleGrantedAuthority auth = new SimpleGrantedAuthority(a);
                auths.add(auth);
            }

            //spring security自带的User对象
            return new User(username, user.getPassword(), true, true, true, true, auths);
        }
        return null;
    }
}
