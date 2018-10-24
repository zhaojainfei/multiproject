package com.yushu.controller;

import com.yushu.model.Card;
import com.yushu.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/card")
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        Card card = new Card();
        return cardService.getList(card);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        Card card = new Card();
        card.setId(id);
        return cardService.get(card);
    }
}
