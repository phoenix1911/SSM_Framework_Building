package com.jialong.security.service;

import com.jialong.security.bean.Users;
import com.jialong.security.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tjl on 2019/3/19 15:13.
 */
@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public Users selectByPrimaryKey(String username) {
        return usersMapper.selectByPrimaryKey(username);

    }

}
