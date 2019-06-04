package com.aimei.beautyshop.entity;

public class Cart {
    private Integer cartid;

    private Integer userid;

    private Integer goodsdetid;

    private Double goodsnum;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
}