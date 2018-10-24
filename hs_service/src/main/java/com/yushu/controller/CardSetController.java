package com.yushu.controller;

import com.yushu.model.CardSet;
import com.yushu.service.CardSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/cardSet")
public class CardSetController {
    @Autowired
    CardSetService cardSetService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        CardSet cardSet = new CardSet();
        return cardSetService.getList(cardSet);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        CardSet cardSet = new CardSet();
        cardSet.setId(id);
        return cardSetService.get(cardSet);
    }
}
