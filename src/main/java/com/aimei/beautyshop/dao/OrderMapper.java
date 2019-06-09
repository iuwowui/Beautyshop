package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int selectlastinsert();

    List<Order> findOrdersBySta(@Param("userid") int userid,@Param("statusid") int statusid);
}