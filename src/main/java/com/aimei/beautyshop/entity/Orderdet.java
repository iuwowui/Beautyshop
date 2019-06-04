package com.aimei.beautyshop.entity;

public class Orderdet {
    private Integer orderdetid;

    private Integer goodsdetid;

    private Double goodsnum;

    private Integer orderid;

    public Integer getOrderdetid() {
        return orderdetid;
    }

    public void setOrderdetid(Integer orderdetid) {
        this.orderdetid = orderdetid;
    }

    public Integer getGoodsdetid() {
        return goodsdetid;
    }

    public void setGoodsdetid(Integer goodsdetid) {
        this.goodsdetid = goodsdetid;
    }

    public Double getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Double goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}