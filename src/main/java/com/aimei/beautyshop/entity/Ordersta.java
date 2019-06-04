package com.aimei.beautyshop.entity;

public class Ordersta {
    private Integer orderstaid;

    private String orderstatus;

    private Integer orderid;

    public Integer getOrderstaid() {
        return orderstaid;
    }

    public void setOrderstaid(Integer orderstaid) {
        this.orderstaid = orderstaid;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}