package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.CartService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@Api(value = "购物车相关操作",tags = "购物车相关操作")
public class CartController {

    @Autowired
    private CartService cartService;

    @CrossOrigin
    @ApiOperation(value = "查看个人所有的购物车信息",notes = "查看个人所有的购物车信息")
    @RequestMapping(value = "/cart/findMyCart.do",method = RequestMethod.GET)
    public JsonBean findMyCart(int userid){

        JsonBean bean = cartService.findAllCartByUid(userid);
        return bean;
    }
}
