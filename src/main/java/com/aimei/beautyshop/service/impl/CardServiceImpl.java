package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CardMapper;
import com.aimei.beautyshop.entity.Card;
import com.aimei.beautyshop.service.CardService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;
    @Override
    public JsonBean insertCard(Card card) {
        if (cardMapper.insert(card) > 0 ){
            return JsonBean.setOK();
        } else {
            return JsonBean.setERROR();
        }
    }
}
