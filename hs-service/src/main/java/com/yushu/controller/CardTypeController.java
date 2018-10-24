package com.yushu.controller;

import com.yushu.model.CardType;
import com.yushu.service.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/cardType")
public class CardTypeController {
    @Autowired
    CardTypeService cardTypeService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        CardType cardType = new CardType();
        return cardTypeService.getList(cardType);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        CardType cardType = new CardType();
        cardType.setId(id);
        return cardTypeService.get(cardType);
    }
}
