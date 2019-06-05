package com.aimei.beautyshop.service;

import com.aimei.beautyshop.vo.JsonBean;

public interface GoodsService {

    public JsonBean findAllGoodsByType(int goodsTypeid);
}
