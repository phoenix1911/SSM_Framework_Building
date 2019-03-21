package com.jialong.core.bean;

public class Student {
    private Integer id;

    private String name;

    private Integer xntid;

    private Integer xwtid;

    private Integer paperid;

    private Long phonenumber;

    private String email;

    private Integer topicstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getXntid() {
        return xntid;
    }

    public void setXntid(Integer xntid) {
        this.xntid = xntid;
    }

    public Integer getXwtid() {
        return xwtid;
    }

    public void setXwtid(Integer xwtid) {
        this.xwtid = xwtid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTopicstatus() {
        return topicstatus;
    }

    public void setTopicstatus(Integer topicstatus) {
        this.topicstatus = topicstatus;
    }
}