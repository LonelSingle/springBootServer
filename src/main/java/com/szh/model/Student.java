package com.szh.model;

import java.util.Date;

public class Student {
    private String stuid;

    private String stuname;

    private Boolean stusex;

    private Date stubirth;

    private String stutel;

    private String stuaddr;

    private Date createTime;

    private Date updateTime;

    private byte[] stuphoto;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Boolean getStusex() {
        return stusex;
    }

    public void setStusex(Boolean stusex) {
        this.stusex = stusex;
    }

    public Date getStubirth() {
        return stubirth;
    }

    public void setStubirth(Date stubirth) {
        this.stubirth = stubirth;
    }

    public String getStutel() {
        return stutel;
    }

    public void setStutel(String stutel) {
        this.stutel = stutel == null ? null : stutel.trim();
    }

    public String getStuaddr() {
        return stuaddr;
    }

    public void setStuaddr(String stuaddr) {
        this.stuaddr = stuaddr == null ? null : stuaddr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public byte[] getStuphoto() {
        return stuphoto;
    }

    public void setStuphoto(byte[] stuphoto) {
        this.stuphoto = stuphoto;
    }
}