package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.GoodstypeMapper;
import com.aimei.beautyshop.entity.Goodstype;
import com.aimei.beautyshop.service.GoodsTypeService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodstypeMapper goodsDao;

    @Override
    public JsonBean findAllGoodsType() {

        List<Goodstype> list = goodsDao.findAllTypes();
        if (list == null || list.isEmpty()){
            return JsonBean.setERROR();
        }else {
            return JsonBean.setOK("ok",list);
        }

    }
}
