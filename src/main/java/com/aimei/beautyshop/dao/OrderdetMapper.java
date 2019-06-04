package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Orderdet;

public interface OrderdetMapper {
    int deleteByPrimaryKey(Integer orderdetid);

    int insert(Orderdet record);

    int insertSelective(Orderdet record);

    Orderdet selectByPrimaryKey(Integer orderdetid);

    int updateByPrimaryKeySelective(Orderdet record);

    int updateByPrimaryKey(Orderdet record);
}