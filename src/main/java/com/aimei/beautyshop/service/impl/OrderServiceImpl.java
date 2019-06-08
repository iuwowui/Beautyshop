package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.CartMapper;
import com.aimei.beautyshop.dao.GoodsdetMapper;
import com.aimei.beautyshop.dao.OrderMapper;
import com.aimei.beautyshop.dao.OrderdetMapper;
import com.aimei.beautyshop.entity.Goodsdet;
import com.aimei.beautyshop.entity.Order;
import com.aimei.beautyshop.entity.Orderdet;
import com.aimei.beautyshop.service.OrderService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private GoodsdetMapper goodsdetMapper;

    @Autowired
   private OrderdetMapper orderdetMapper;


    @Override
    public JsonBean addOrder(int userid, int[] cartid, int[] gooddetid, int[] nums,Double totalprice) {

        if (cartid.length != gooddetid.length){
            return JsonBean.setERROR();
        }
        if (cartid.length != nums.length){
            return JsonBean.setERROR();
        }
        for (int i = 0;i < cartid.length;i++){
            Goodsdet goodsdet = goodsdetMapper.selectByPrimaryKey(gooddetid[i]);
            if (goodsdet.getGoodsnum() < nums[i]){
                return JsonBean.setOK("该商品数量有限",goodsdet.getGoodstype());
            }
        }
        Order order = new Order();
        order.setCreattime(new Date());
        order.setOrderstaid(1);
        order.setTotalprice(totalprice);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String time = format.format(new Date());
        String str = "";
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        for (int i = 0; i <6; i++){
            char num = ch[random.nextInt(ch.length)];
            str += num;
        }

        String ordercode = time + str;
        order.setOrdercode(ordercode);
        orderMapper.insert(order);

        for (int i = 0;i < cartid.length;i++){
            Orderdet orderdet = new Orderdet();
            orderdet.setGoodsdetid(gooddetid[i]);
            orderdet.setGoodsnum((double) nums[i]);
            orderdet.setOrderid(1);
        }
        return JsonBean.setOK();
    }
}
