package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Goodsdet;

public interface GoodsdetMapper {
    int deleteByPrimaryKey(Integer goodsdetid);

    int insert(Goodsdet record);

    int insertSelective(Goodsdet record);

    Goodsdet selectByPrimaryKey(Integer goodsdetid);

    int updateByPrimaryKeySelective(Goodsdet record);

    int updateByPrimaryKey(Goodsdet record);
}