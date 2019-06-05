package com.aimei.beautyshop.dao;


import com.aimei.beautyshop.entity.Goodsdet;

import java.util.List;

public interface GoodsdetMapper {
    int deleteByPrimaryKey(Integer goodsdetid);

    int insert(Goodsdet record);

    int insertSelective(Goodsdet record);

    Goodsdet selectByPrimaryKey(Integer goodsdetid);

    int updateByPrimaryKeySelective(Goodsdet record);

    int updateByPrimaryKey(Goodsdet record);

    List<Goodsdet> findGoodsDetByGoodsId(int goodsId);
}