package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Ordersta;

public interface OrderstaMapper {
    int deleteByPrimaryKey(Integer orderstaid);

    int insert(Ordersta record);

    int insertSelective(Ordersta record);

    Ordersta selectByPrimaryKey(Integer orderstaid);

    int updateByPrimaryKeySelective(Ordersta record);

    int updateByPrimaryKey(Ordersta record);
}