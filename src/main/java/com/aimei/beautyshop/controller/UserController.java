package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.service.UserService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "用户操作",tags = "用户操作")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @CrossOrigin
    @ApiOperation(value = "用户登录",notes = "这是一个实现用户登录的功能")
    @RequestMapping(value = "user/login.do",method = RequestMethod.GET)
    public JsonBean login(int userid){
        return JsonBean.setOK("OK",userService.login(userid));
    }

    // 更改
    @CrossOrigin
    @ApiOperation(value = "用户信息修改",notes = "这是一个实现完善用户信息的功能")
    @RequestMapping(value = "user/update.do",method = RequestMethod.PUT)
    public JsonBean update(int userid,String realname, String userphone, Date userbirth, String useremail){
        return JsonBean.setOK("OK",userService.updateUserInfo(userid,realname,userphone,userbirth,  useremail));
    }
}
