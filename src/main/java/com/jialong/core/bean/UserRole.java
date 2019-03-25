package com.jialong.core.bean;

public class UserRole {
    public UserRole(String username, Integer rid) {
        this.username = username;
        this.rid = rid;
    }

    private Integer id;

    private String username;

    private Integer rid;

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