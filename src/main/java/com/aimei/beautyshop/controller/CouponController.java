package com.aimei.beautyshop.controller;


import com.aimei.beautyshop.entity.Coupon;
import com.aimei.beautyshop.service.CouponService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "优惠券操作",tags = "优惠券操作")
@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @CrossOrigin
    @ApiOperation(value = "新增优惠券",notes = "这是一个新增优惠券的操作")
    @RequestMapping(value = "coupon/add.do",method = RequestMethod.POST)
    JsonBean addCoupon(@RequestBody Coupon coupon){
        return JsonBean.setOK("OK",couponService.addCoupon(coupon));
    }
}
