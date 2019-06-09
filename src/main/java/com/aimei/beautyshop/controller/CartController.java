package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.CartService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@Api(value = "购物车相关操作",tags = "购物车相关操作")
public class CartController {

    @Autowired
    private CartService cartService;

    @CrossOrigin
    @ApiOperation(value = "查看个人购物车",notes = "查看个人所有的购物车信息")
    @RequestMapping(value = "/cart/findMyCart.do",method = RequestMethod.GET)
    public JsonBean findMyCart(int userid){

        JsonBean bean = cartService.findAllCartByUid(userid);
        return bean;
    }

    @CrossOrigin
    @ApiOperation(value = "添加至购物车",notes = "添加商品至购物车内")
    @RequestMapping(value = "/cart/addCart.do",method = RequestMethod.POST)
    public JsonBean addCart(int userid,int goodsDetId){
        JsonBean bean = cartService.addCart(userid, goodsDetId);
        return bean;
    }

    @CrossOrigin
    @ApiOperation(value = "删除购物车",notes = "批量删除购物车")
    @RequestMapping(value = "/cart/deleteCarts.do",method = RequestMethod.DELETE)
    public JsonBean deleteCart(@RequestParam("ids") int[] ids ){
        JsonBean bean = cartService.deleteByCartId(ids);
        return bean;
    }

    @CrossOrigin
    @ApiOperation(value = "更新购物数量",notes ="更新购物车中的商品数量" )
    @RequestMapping(value = "/cart/updateCart",method = RequestMethod.PUT)
    public JsonBean updateCart(int cartId,double num){
        JsonBean bean = cartService.updateCart(cartId, num);
        return bean;
    }
}
