package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Cart;
import com.aimei.beautyshop.vo.VCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<VCart> findAllCartByUid(int uid);

    Cart selectCartByCon(@Param("userid") int userid,@Param("goodsdetId") int goodDetId);

    int deleteCartByIds(@Param("ids") int[] ids);
}