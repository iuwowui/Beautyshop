package com.aimei.beautyshop.entity;

import java.util.Date;

public class Order {
    private Integer orderid;

    private String ordercode;

    private Integer orderstaid;

    private Double totalprice;

    private Date creattime;

    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Integer getOrderstaid() {
        return orderstaid;
    }

    public void setOrderstaid(Integer orderstaid) {
        this.orderstaid = orderstaid;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}