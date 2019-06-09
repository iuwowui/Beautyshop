package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.MsgMapper;
import com.aimei.beautyshop.entity.Msg;
import com.aimei.beautyshop.service.MsgService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    private MsgMapper msgMapper;
    @Override
    public JsonBean addMsg(Msg msg) {

        msg.setMsgtime(new Date());
        if (msgMapper.insert(msg) > 0){
            return JsonBean.setOK();
        }else {
            return JsonBean.setERROR();
        }
    }
}
