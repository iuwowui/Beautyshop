package com.aimei.beautyshop.service;

import com.aimei.beautyshop.vo.JsonBean;

public interface OrderService {

    public JsonBean addOrder(int userid,int[] cartid,int[] gooddetid,int [] nums,Double totalprice);

    public JsonBean findOrderByStatus(int userid,int statusid);
}
