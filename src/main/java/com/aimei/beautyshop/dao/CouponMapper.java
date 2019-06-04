package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Coupon;

public interface CouponMapper {
    int deleteByPrimaryKey(Integer couponid);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Integer couponid);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}