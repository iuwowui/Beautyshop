package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.vo.VGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {


    //根据商品类型查询所有的该类型商品
    List<VGoods> findGoodsByType(int typeid);

    //根据商品的名字进行模糊查询
    List<VGoods> findGoodsByCon(@Param("typeid") int typeid,@Param("goodsName") String goodsName);
}