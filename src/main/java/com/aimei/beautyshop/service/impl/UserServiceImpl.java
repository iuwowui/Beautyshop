package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.service.UserService;
import com.aimei.beautyshop.vo.JsonBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public JsonBean login(int userid) {
        User user = userMapper.selectById(userid);
        if (user != null){
            return JsonBean.setOK("OK",user);
        }else {
            return JsonBean.setERROR();
        }
    }

    @Override
    public JsonBean updateUserInfo(int userid, String realname, String userphone, Date userbirth, String useremail) {
        if (userMapper.updataById(userid,realname,userphone,userbirth,  useremail) > 0) {
            return JsonBean.setOK();
        } else {
            return JsonBean.setERROR();
        }
    }
}
