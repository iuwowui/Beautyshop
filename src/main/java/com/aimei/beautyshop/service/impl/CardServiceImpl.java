package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CardMapper;
import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.Card;
import com.aimei.beautyshop.service.CardService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public JsonBean insertCard(Card card) {
        String birth = userMapper.selectBirth(card.getCardid());
        card.setCardcode(birth + (int)(100 + Math.random()*900));
        card.setIntegral(0);
        card.setDrawtime(new Date());
        if (cardMapper.addCard(card) > 0 ){
            return JsonBean.setOK();
        } else {
            return JsonBean.setERROR();
        }
    }
}
