package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.GoodsDetService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@Api(value = "商品详情操作",tags = "商品详情操作")
public class GoodsDetController {

    @Autowired
    private GoodsDetService goodsDetService;


    @ApiOperation(value = "通过商品id查看该商品的详情", notes = "查看商品详情")
    @RequestMapping("")
    public JsonBean findGoodsDet(int goodsId){
        JsonBean bean = goodsDetService.findGoodsDetByGid(goodsId);
        return bean;
    }
}
