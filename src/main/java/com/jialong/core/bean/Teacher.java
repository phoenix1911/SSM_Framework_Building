package com.jialong.core.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer tid;

    private String tname;

    private Integer tphonenumber;

    private String address;

    private Integer type;

    private Integer isuploadtopic;

    private Long sfz;

    public Teacher() {
    }

    public Teacher(Integer tid, String tname, Integer tphonenumber, String address, Integer type, Integer isuploadtopic, Long sfz) {
        this.tid = tid;
        this.tname = tname;
        this.tphonenumber = tphonenumber;
        this.address = address;
        this.type = type;
        this.isuploadtopic = isuploadtopic;
        this.sfz = sfz;
    }

    public Long getSfz() {
        return sfz;
    }


    public void setSfz(Long sfz) {
        this.sfz = sfz;
    }

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

    public Integer getIsuploadtopic() {
        return isuploadtopic;
    }

    public void setIsuploadtopic(Integer isuploadtopic) {
        this.isuploadtopic = isuploadtopic;
    }
}