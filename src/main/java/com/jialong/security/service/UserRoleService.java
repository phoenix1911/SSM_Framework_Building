package com.jialong.security.service;

import com.jialong.core.bean.UserRole;
import com.jialong.core.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/4/3 9:16.
 */
@Service
public class UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<UserRole> selectAll() {
        return userRoleMapper.selectAll();
    }
}
