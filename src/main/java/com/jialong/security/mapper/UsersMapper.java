package com.jialong.security.mapper;

import com.jialong.security.bean.Users;

import java.util.List;

public interface UsersMapper {

    int deleteByPrimaryKey(String username);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String username);

    List<String> selectAuthorityByUsername(String username);

    List<Users> selectAll();

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}