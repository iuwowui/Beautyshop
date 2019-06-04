package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addrid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addrid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}