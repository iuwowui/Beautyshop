package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CouponMapper;
import com.aimei.beautyshop.entity.Coupon;
import com.aimei.beautyshop.service.CouponService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponMapper;
    @Override
    public JsonBean addCoupon(Coupon coupon) {
        if (couponMapper.insert(coupon) > 0){
            return JsonBean.setOK();
        }else {
            return JsonBean.setERROR();
        }
    }
}
