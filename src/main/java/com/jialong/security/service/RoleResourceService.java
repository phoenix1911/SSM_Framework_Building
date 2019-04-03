package com.jialong.security.service;

import com.jialong.security.bean.RoleResource;
import com.jialong.security.mapper.RoleResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/4/2 17:09.
 */
@Service
public class RoleResourceService {
    @Autowired
    private RoleResourceMapper roleResourceMapper;

    public List<RoleResource> selectAll() {
        return roleResourceMapper.selectAll();
    }
}
