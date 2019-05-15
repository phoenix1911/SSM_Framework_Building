package com.jialong.core.bean;

import com.jialong.security.bean.Role;
import com.jialong.security.bean.Users;

import java.io.Serializable;

public class UserRole implements Serializable {

    public UserRole() {}

    public UserRole(String username, Integer rid) {
        this.username = username;
        this.rid = rid;
    }

    private Integer id;

    private String username;

    private Integer rid;

    private Users users;

    private Role role;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}