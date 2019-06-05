package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.vo.VGoods;

import java.util.List;

public interface GoodsMapper {


    //根据商品类型查询所有的该类型商品
    List<VGoods> findGoodsByType(int typeid);
}