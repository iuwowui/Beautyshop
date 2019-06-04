package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(int id) {
        User user = userMapper.selectById(id);
        if (user == null){
            throw new RuntimeException("该用户不存在");
        }

        return null;
    }
}
