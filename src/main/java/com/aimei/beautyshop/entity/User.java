package com.aimei.beautyshop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userid;

    private String username;

    private String userphone;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userbirth;

    private String useremail;

    private String userimg;

    private Integer cardid;

    private Integer addrid;

    private String realname;

}