package com.aimei.beautyshop.service.impl;

import com.aimei.beautyshop.dao.GoodsdetMapper;
import com.aimei.beautyshop.entity.Goodsdet;
import com.aimei.beautyshop.service.GoodsDetService;
import com.aimei.beautyshop.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetServiceImpl implements GoodsDetService {

    @Autowired
    private GoodsdetMapper goodsdetMapper;

    @Override
    public JsonBean findGoodsDetByGid(int goodsId) {

        List<Goodsdet> list = goodsdetMapper.findGoodsDetByGoodsId(goodsId);

        if (list == null || list.isEmpty()){
               return JsonBean.setOK("暂无数据",null);
        }else{
                return JsonBean.setOK("ok",list);
        }

    }

    @Override
    public JsonBean findGoodDetByDid(int goodsDetId) {

        Goodsdet goodsdet = goodsdetMapper.selectByPrimaryKey(goodsDetId);

        return JsonBean.setOK("ok",goodsdet);
    }
}
