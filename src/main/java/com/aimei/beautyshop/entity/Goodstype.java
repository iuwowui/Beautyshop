package com.aimei.beautyshop.entity;

public class Goodstype {
    private Integer typeid;

    private String typename;

    private String typeimg;

    private Integer typestatus;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypeimg() {
        return typeimg;
    }

    public void setTypeimg(String typeimg) {
        this.typeimg = typeimg == null ? null : typeimg.trim();
    }

    public Integer getTypestatus() {
        return typestatus;
    }

    public void setTypestatus(Integer typestatus) {
        this.typestatus = typestatus;
    }
}