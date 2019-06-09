package com.aimei.beautyshop.controller;

import com.aimei.beautyshop.entity.Card;
import com.aimei.beautyshop.service.CardService;
import com.aimei.beautyshop.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "会员卡操作",tags = "会员卡操作")
@RestController
public class CardController extends BaseController {

    @Autowired
    private CardService cardService;

    @CrossOrigin
    @ApiOperation(value = "新增会员卡",notes = "这是一个实现新增会员卡的方法")
    @RequestMapping(value = "card/add.do",method = RequestMethod.POST)
    public JsonBean insertCard(@RequestBody Card card){
        return JsonBean.setOK("OK",cardService.insertCard(card));
    }

}
