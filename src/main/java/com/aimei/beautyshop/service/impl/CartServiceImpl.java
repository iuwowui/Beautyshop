package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CartMapper;
import com.aimei.beautyshop.entity.Cart;
import com.aimei.beautyshop.service.CartService;
import com.aimei.beautyshop.vo.JsonBean;
import com.aimei.beautyshop.vo.VCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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

    @Override
    public JsonBean addCart(int userid, int goodsdetId) {

        Cart cart = cartMapper.selectCartByCon(userid, goodsdetId);
        if (cart == null){
            Cart cart1 = new Cart();
            cart1.setGoodsdetid(goodsdetId);
            cart1.setUserid(userid);
            cart1.setGoodsnum((double) 1);
            cartMapper.insertSelective(cart);
        }else {
            Double goodsnum = cart.getGoodsnum();
            Cart cart1 = new Cart();
            cart1.setCartid(cart.getCartid());
            cart1.setGoodsdetid(goodsdetId);
            cart1.setUserid(userid);
            cart1.setGoodsnum(goodsnum + 1);
            cartMapper.updateByPrimaryKeySelective(cart1);
        }
        return JsonBean.setOK("ok",null);
    }

    @Override
    public JsonBean deleteByCartId(int[] ids) {
        int i = cartMapper.deleteCartByIds(ids);

        if (i >0){
            return JsonBean.setOK();
        }else {
            return JsonBean.setERROR();
        }

    }
}
