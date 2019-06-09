package com.aimei.beautyshop.dao;

import com.aimei.beautyshop.entity.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Integer cardid);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer cardid);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);

    int addCard(Card card);
}