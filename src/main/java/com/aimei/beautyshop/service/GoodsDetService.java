package com.aimei.beautyshop.service;

import com.aimei.beautyshop.vo.JsonBean;

public interface GoodsDetService {

    public JsonBean findGoodsDetByGid(int goodsId);

    public JsonBean findGoodDetByDid(int goodsDetId);
}
