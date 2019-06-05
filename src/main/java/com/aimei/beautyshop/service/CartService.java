package com.aimei.beautyshop.service;

import com.aimei.beautyshop.vo.JsonBean;

public interface CartService {

    public JsonBean findAllCartByUid(int userid);

    public JsonBean addCart(int userid,int goodsdetId);

    public JsonBean deleteByCartId(int[] ids);
}
