package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.service.UserService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
