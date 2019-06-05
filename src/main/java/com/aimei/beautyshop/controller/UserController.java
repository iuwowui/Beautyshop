package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.service.UserService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户登录",tags = "用户登录")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @CrossOrigin
    @ApiOperation(value = "用户登录",notes = "这是一个实现用户登录的功能")
    @RequestMapping(value = "user/login.do",method = RequestMethod.GET)
    public JsonBean login(int userid){
        return userService.login(userid);
    }
}
