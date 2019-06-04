package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Goodstype;

import java.util.List;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);


    List<Goodstype> findAllTypes();
}