package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}