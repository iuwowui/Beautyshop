package com.aimei.beautyshop.entity;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String userphone;

    private Date userbirth;

    private String useremail;

    private String userimg;

    private Integer cardid;

    private Integer addrid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Date getUserbirth() {
        return userbirth;
    }

    public void setUserbirth(Date userbirth) {
        this.userbirth = userbirth;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Integer getAddrid() {
        return addrid;
    }

    public void setAddrid(Integer addrid) {
        this.addrid = addrid;
    }
}