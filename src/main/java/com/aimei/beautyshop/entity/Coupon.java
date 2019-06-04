package com.aimei.beautyshop.entity;

import java.util.Date;

public class Coupon {
    private Integer couponid;

    private Date begintimedatatime;

    private Date endtime;

    private String coupondesc;

    private Integer couponmoney;

    private Integer couponstatus;

    private Integer minicoupon;

    private Integer userid;

    public Integer getCouponid() {
        return couponid;
    }

    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    public Date getBegintimedatatime() {
        return begintimedatatime;
    }

    public void setBegintimedatatime(Date begintimedatatime) {
        this.begintimedatatime = begintimedatatime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCoupondesc() {
        return coupondesc;
    }

    public void setCoupondesc(String coupondesc) {
        this.coupondesc = coupondesc == null ? null : coupondesc.trim();
    }

    public Integer getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Integer couponmoney) {
        this.couponmoney = couponmoney;
    }

    public Integer getCouponstatus() {
        return couponstatus;
    }

    public void setCouponstatus(Integer couponstatus) {
        this.couponstatus = couponstatus;
    }

    public Integer getMinicoupon() {
        return minicoupon;
    }

    public void setMinicoupon(Integer minicoupon) {
        this.minicoupon = minicoupon;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}