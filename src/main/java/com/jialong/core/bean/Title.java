package com.jialong.core.bean;


import java.io.Serializable;

public class Title implements Serializable {
    private Integer id;

    private String title;

    private Integer isuploadrws;

    private String rws;

    private Integer isuploadktbg;

    private String ktbg;

    private Integer isuploadsms;

    private String sms;

    private String rwsstate;

    private String ktbgstate;

    private String smsstate;

    private Integer tid;

    private Integer sid;

    private Integer isuploadzqbg;

    private String zqbg;

    private String zqbgstate;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsuploadrws() {
        return isuploadrws;
    }

    public void setIsuploadrws(Integer isuploadrws) {
        this.isuploadrws = isuploadrws;
    }

    public String getRws() {
        return rws;
    }

    public void setRws(String rws) {
        this.rws = rws == null ? null : rws.trim();
    }

    public Integer getIsuploadktbg() {
        return isuploadktbg;
    }

    public void setIsuploadktbg(Integer isuploadktbg) {
        this.isuploadktbg = isuploadktbg;
    }

    public String getKtbg() {
        return ktbg;
    }

    public void setKtbg(String ktbg) {
        this.ktbg = ktbg == null ? null : ktbg.trim();
    }

    public Integer getIsuploadsms() {
        return isuploadsms;
    }

    public void setIsuploadsms(Integer isuploadsms) {
        this.isuploadsms = isuploadsms;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms == null ? null : sms.trim();
    }

    public String getRwsstate() {
        return rwsstate;
    }

    public void setRwsstate(String rwsstate) {
        this.rwsstate = rwsstate == null ? null : rwsstate.trim();
    }

    public String getKtbgstate() {
        return ktbgstate;
    }

    public void setKtbgstate(String ktbgstate) {
        this.ktbgstate = ktbgstate == null ? null : ktbgstate.trim();
    }

    public String getSmsstate() {
        return smsstate;
    }

    public void setSmsstate(String smsstate) {
        this.smsstate = smsstate == null ? null : smsstate.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getIsuploadzqbg() {
        return isuploadzqbg;
    }

    public void setIsuploadzqbg(Integer isuploadzqbg) {
        this.isuploadzqbg = isuploadzqbg;
    }

    public String getZqbg() {
        return zqbg;
    }

    public void setZqbg(String zqbg) {
        this.zqbg = zqbg == null ? null : zqbg.trim();
    }

    public String getZqbgstate() {
        return zqbgstate;
    }

    public void setZqbgstate(String zqbgstate) {
        this.zqbgstate = zqbgstate == null ? null : zqbgstate.trim();
    }
}