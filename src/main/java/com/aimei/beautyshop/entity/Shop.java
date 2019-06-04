package com.aimei.beautyshop.entity;

public class Shop {
    private Integer shopid;

    private String shopname;

    private String shopimg;

    private String shopdesc;

    private Integer shopstar;

    private Double shopsales;

    private Integer shopcollect;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg == null ? null : shopimg.trim();
    }

    public String getShopdesc() {
        return shopdesc;
    }

    public void setShopdesc(String shopdesc) {
        this.shopdesc = shopdesc == null ? null : shopdesc.trim();
    }

    public Integer getShopstar() {
        return shopstar;
    }

    public void setShopstar(Integer shopstar) {
        this.shopstar = shopstar;
    }

    public Double getShopsales() {
        return shopsales;
    }

    public void setShopsales(Double shopsales) {
        this.shopsales = shopsales;
    }

    public Integer getShopcollect() {
        return shopcollect;
    }

    public void setShopcollect(Integer shopcollect) {
        this.shopcollect = shopcollect;
    }
}