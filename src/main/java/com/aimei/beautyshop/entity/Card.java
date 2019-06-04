package com.aimei.beautyshop.entity;

import java.util.Date;

public class Card {
    private Integer cardid;

    private Date drawtime;

    private Integer integral;

    private String cardcode;

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Date getDrawtime() {
        return drawtime;
    }

    public void setDrawtime(Date drawtime) {
        this.drawtime = drawtime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode == null ? null : cardcode.trim();
    }
}