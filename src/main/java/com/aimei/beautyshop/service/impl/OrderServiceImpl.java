package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CartMapper;
import com.aimei.beautyshop.dao.GoodsdetMapper;
import com.aimei.beautyshop.dao.OrderMapper;
import com.aimei.beautyshop.entity.Cart;
import com.aimei.beautyshop.entity.Goodsdet;
import com.aimei.beautyshop.service.OrderService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private GoodsdetMapper goodsdetMapper;

    @Override
    public JsonBean addOrder(int userid, int[] cartid) {

        List<Cart> carts = cartMapper.findCartsByCid(cartid);

        if (carts == null || carts.isEmpty()){
            return JsonBean.setERROR();
        }

        Map<Object,Object> map = new HashMap<>();
        for (Cart cart: carts) {
            Integer goodsdetid = cart.getGoodsdetid();
            Goodsdet goodsdet = goodsdetMapper.selectByPrimaryKey(goodsdetid);
            if (goodsdet == null) {
                map.put(cart.getCartid(),"该商品已下架");
            }
            if (goodsdet.getGoodsstatus() == 0){
                map.put(cart.getCartid(),"该商品已下架");
            }
            if (goodsdet.getGoodsstatus() == 2){
                map.put(cart.getCartid(),"该商品已售完");
            }
        }

        return null;
    }
}
