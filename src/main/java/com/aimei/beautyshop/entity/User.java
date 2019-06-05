package com.aimei.beautyshop.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userid;

    private String username;

    private String userphone;

    private Date userbirth;

    private String useremail;

    private String userimg;

    private Integer cardid;

    private Integer addrid;

    private String realname;

}