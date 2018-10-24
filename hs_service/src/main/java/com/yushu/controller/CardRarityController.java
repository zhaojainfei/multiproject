package com.yushu.controller;

import com.yushu.model.CardRarity;
import com.yushu.service.CardRarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/cardRarity")
public class CardRarityController {
    @Autowired
    CardRarityService cardRarityService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        CardRarity cardRarity = new CardRarity();
        return cardRarityService.getList(cardRarity);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        CardRarity cardRarity = new CardRarity();
        cardRarity.setId(id);
        return cardRarityService.get(cardRarity);
    }
}
