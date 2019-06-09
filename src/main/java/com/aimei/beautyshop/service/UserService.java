package com.aimei.beautyshop.service;

import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.vo.JsonBean;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserService {
    JsonBean login(int userid);

    JsonBean updateUserInfo(int userid,String realname, String userphone,  Date userbirth,  String useremail);
}
