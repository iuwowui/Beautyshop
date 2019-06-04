package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.GoodsTypeService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(value = "商品类型操作", tags = "商品类型操作")
@Controller
@ResponseBody
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

    @CrossOrigin
    @ApiOperation(value = "查看所有一级商品分类",notes = "这是一个查询所有的一级商品分类的方法")
    @RequestMapping(value="/Goodstype/findallTypes.do", method = RequestMethod.GET)
    public JsonBean findAllType(){
        JsonBean bean = goodsTypeService.findAllGoodsType();
        return bean;
    }
}
