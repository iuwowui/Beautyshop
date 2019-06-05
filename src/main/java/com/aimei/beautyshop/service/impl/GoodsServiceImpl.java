package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.GoodsMapper;
import com.aimei.beautyshop.service.GoodsService;
import com.aimei.beautyshop.vo.JsonBean;
import com.aimei.beautyshop.vo.VGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl  implements GoodsService {

    @Autowired
    private GoodsMapper goodsDao;

    @Override
    public JsonBean findAllGoodsByType(int goodsTypeid) {
        List<VGoods> goods = goodsDao.findGoodsByType(goodsTypeid);

        if (goods == null || goods.isEmpty()){
            return JsonBean.setERROR();
        }else {
            return JsonBean.setOK("ok",goods);
        }

    }
}
