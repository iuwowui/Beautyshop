package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Goodsimg;

public interface GoodsimgMapper {
    int deleteByPrimaryKey(Integer imgid);

    int insert(Goodsimg record);

    int insertSelective(Goodsimg record);

    Goodsimg selectByPrimaryKey(Integer imgid);

    int updateByPrimaryKeySelective(Goodsimg record);

    int updateByPrimaryKey(Goodsimg record);
}