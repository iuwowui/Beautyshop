package com.aimei.beautyshop.service;

import com.aimei.beautyshop.vo.JsonBean;

public interface CartService {

    public JsonBean findAllCartByUid(int userid);
}
