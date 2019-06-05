package com.aimei.beautyshop.vo;

import com.aimei.beautyshop.entity.Cart;
import lombok.Data;

@Data
public class VCart extends Cart {

    private String imgpath;
    private String goodstype;
    private double goodsprice;
    private String goodsdesc;

}
