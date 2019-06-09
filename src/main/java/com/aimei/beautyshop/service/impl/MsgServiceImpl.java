package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.MsgMapper;
import com.aimei.beautyshop.dao.UserMapper;
import com.aimei.beautyshop.entity.Msg;
import com.aimei.beautyshop.service.MsgService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    private MsgMapper msgMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public JsonBean addMsg(Integer userid) {
        Msg msg = new Msg();
        msg.setUserid(userid);
        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //加上时间
        //必须捕获异常
        try {

             Date date=sDateFormat.parse(userMapper.selectMsgTime(userid));

            msg.setMsgtime(date);

        } catch(ParseException px) {
            px.printStackTrace();
        }
        msg.setMsgtime(new Date());
        msg.setMsgstatus(1);
        if (msgMapper.insert(msg) > 0){
            return JsonBean.setOK();
        }else {
            return JsonBean.setERROR();
        }
    }

}
