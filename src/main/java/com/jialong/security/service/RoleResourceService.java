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

    /**
     * 56 是 学生角色选题对应的id
     * @param enabled
     * @return
     */
    public void updateStuSelectTitle(int enabled) {
        RoleResource roleResource = roleResourceMapper.selectByPrimaryKey(56);
        if (enabled == 1) {
            roleResource.setRid(3);
        }else if (enabled==0) {
            roleResource.setRid(0);
        }
        roleResourceMapper.updateByPrimaryKey(roleResource);
    }

    public int stuSelectTitlefunctionstate() {
        RoleResource roleResource = roleResourceMapper.selectByPrimaryKey(56);
        return roleResource.getRid();
    }
}
