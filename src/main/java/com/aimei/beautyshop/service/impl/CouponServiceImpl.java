package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CouponMapper;
import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.Coupon;
import com.aimei.beautyshop.service.CouponService;
import com.aimei.beautyshop.util.GetDay;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public JsonBean addCoupon(int userid) {
        Coupon coupon = new Coupon();
        try {
            String time = GetDay.plusDay(15, userMapper.selectMsgTime(userid));
            SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sDateFormat.parse(time);
            Date date1 = sDateFormat.parse(userMapper.selectMsgTime(userid));
            coupon.setBegintimedatatime(date1);
            coupon.setEndtime(date);
            coupon.setCouponmoney(50);
            coupon.setMinicoupon(10);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return JsonBean.setOK();
    }


}
