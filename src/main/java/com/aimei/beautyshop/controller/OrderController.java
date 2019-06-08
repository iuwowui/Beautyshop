package com.aimei.beautyshop.controller;


import com.aimei.beautyshop.service.OrderService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@Api(value = "订单操作",tags = "关于订单操作")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @CrossOrigin
    @ApiOperation(value = "添加订单",notes = "添加订单以及订单详情")
    @RequestMapping(value = "/order/addOrder.do" ,method = RequestMethod.POST)
    public JsonBean addOrder( int[] cartids,int[] gooddetids, int[]nums, int userid,Double totalprice){
        JsonBean bean = orderService.addOrder(userid, cartids, gooddetids, nums, totalprice);
        return bean;
    }
}
