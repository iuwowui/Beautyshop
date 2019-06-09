package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectById(int userid);

    int updataById(@Param("userid") int userid,@Param("realname")String realname, @Param("userphone") String userphone, @Param("userbirth") Date userbirth,@Param("useremail") String useremail);

    String selectBirth(int cardid);

    String selectMsgTime(int userid);
}