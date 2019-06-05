package com.aimei.beautyshop.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer typeid;

    private Double goodssales;

    private String goodsevaluate;

    public Double getGoodssales() {
        return goodssales;
    }

    public void setGoodssales(Double goodssales) {
        this.goodssales = goodssales;
    }

    public String getGoodsevaluate() {
        return goodsevaluate;
    }

    public void setGoodsevaluate(String goodsevaluate) {
        this.goodsevaluate = goodsevaluate;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}