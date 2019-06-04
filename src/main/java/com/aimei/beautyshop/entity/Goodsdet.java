package com.aimei.beautyshop.entity;

public class Goodsdet {
    private Integer goodsdetid;

    private Integer goodsid;

    private String goodstype;

    private Double goodsprice;

    private Double goodsnum;

    private Integer goodsstatus;

    public Integer getGoodsdetid() {
        return goodsdetid;
    }

    public void setGoodsdetid(Integer goodsdetid) {
        this.goodsdetid = goodsdetid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype == null ? null : goodstype.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Double getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Double goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(Integer goodsstatus) {
        this.goodsstatus = goodsstatus;
    }
}