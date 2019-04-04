package com.jialong.security.bean;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;

    private String roleName;

    private String roleNameZh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleNameZh() {
        return roleNameZh;
    }

    public void setRoleNameZh(String roleNameZh) {
        this.roleNameZh = roleNameZh == null ? null : roleNameZh.trim();
    }
}