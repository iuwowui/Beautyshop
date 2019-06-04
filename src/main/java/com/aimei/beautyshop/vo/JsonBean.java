package com.aimei.beautyshop.vo;

import lombok.Data;

@Data
public class JsonBean {
    private int code;
    private String msg;
    private Object data;

    public static JsonBean setOK(){
        JsonBean bean=new JsonBean();
        bean.setCode(1);
        bean.setMsg("OK");
        bean.setData(null);
        return bean;
    }
    public static JsonBean setOK(String msg,Object data){
        JsonBean bean=new JsonBean();
        bean.setCode(1);
        bean.setMsg(msg);
        bean.setData(data);
        return bean;
    }
    public static JsonBean setERROR(){
        JsonBean bean=new JsonBean();
        bean.setCode(0);
        bean.setMsg("ERROR");
        bean.setData(null);
        return bean;
    }
}
