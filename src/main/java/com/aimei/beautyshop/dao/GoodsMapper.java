package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Goods;
import com.aimei.beautyshop.vo.VGoods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //根据商品类型查询所有的该类型商品
    List<VGoods> findGoodsByType(int typeid);
}