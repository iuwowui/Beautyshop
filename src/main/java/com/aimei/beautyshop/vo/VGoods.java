package com.aimei.beautyshop.vo;

import com.aimei.beautyshop.entity.Goods;
import com.aimei.beautyshop.entity.Goodsimg;
import lombok.Data;

import java.util.List;
@Data
public class VGoods extends Goods {

    private List<Goodsimg> goodsimgs;
}
