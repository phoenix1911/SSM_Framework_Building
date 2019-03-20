package com.jialong.security.bean;

import java.io.Serializable;

public class RoleResource implements Serializable {
    private Integer id;

    private Integer rid;

    private Integer resid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }
}