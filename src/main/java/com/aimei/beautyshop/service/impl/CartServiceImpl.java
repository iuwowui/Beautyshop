package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CartMapper;
import com.aimei.beautyshop.service.CartService;
import com.aimei.beautyshop.vo.JsonBean;
import com.aimei.beautyshop.vo.VCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {


    @Autowired
    private CartMapper cartMapper;

    @Override
    public JsonBean findAllCartByUid(int userid) {

        List<VCart> cart = cartMapper.findAllCartByUid(userid);

        if (cart == null || cart.isEmpty()){
            return JsonBean.setOK("暂无数据",null);
        }else {
            return JsonBean.setOK("ok",cart);
        }
    }
}
