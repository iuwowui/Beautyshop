package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.entity.Msg;
import com.aimei.beautyshop.service.MsgService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "系统消息操作",tags = "系统消息操作")
@RestController
public class MsgController {

    @Autowired
    private MsgService msgService;

    @CrossOrigin
    @ApiOperation(value = "新增消息",notes = "这是一个新增消息的功能")
    @RequestMapping(value = "msg/add.do",method = RequestMethod.POST)
    JsonBean addMsg(@RequestBody Msg msg){
        return JsonBean.setOK("OK",msgService.addMsg(msg));
    }
}
