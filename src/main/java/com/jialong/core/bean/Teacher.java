package com.jialong.core.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer tid;

    private String tname;

    private Integer tphonenumber;

    private String address;

    private Integer type;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTphonenumber() {
        return tphonenumber;
    }

    public void setTphonenumber(Integer tphonenumber) {
        this.tphonenumber = tphonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}