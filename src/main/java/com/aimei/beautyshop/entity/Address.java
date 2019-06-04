package com.aimei.beautyshop.entity;

public class Address {
    private Integer addrid;

    private String address;

    private String linkman;

    private String linkphone;

    private Integer userid;

    public Integer getAddrid() {
        return addrid;
    }

    public void setAddrid(Integer addrid) {
        this.addrid = addrid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}