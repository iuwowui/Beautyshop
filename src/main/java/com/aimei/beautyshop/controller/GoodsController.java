package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.GoodsService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "商品操作",tags = "商品操作")
@ResponseBody
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @CrossOrigin
    @ApiOperation(value = "根据商品类型查看所有的商品",tags = "查看所有的商品类型")
    @RequestMapping(value = "/goods/findAllgoods.do",method = RequestMethod.GET)
    public JsonBean findAllGoodsByTypeId(int typeId){
        JsonBean bean = goodsService.findAllGoodsByType(typeId);
        return bean;
    }

    @CrossOrigin
    @ApiOperation(value = "根据商品名称进行模糊查询",tags = "根据商品名进行模糊查询")
    @RequestMapping(value = "/goods/findGoodsByCon.do",method = RequestMethod.GET)

    public JsonBean findGoodsByCon(int typeId,String goodsName){
        JsonBean bean = goodsService.findGoodsByCon(typeId, goodsName);
        return bean;
    }

}
