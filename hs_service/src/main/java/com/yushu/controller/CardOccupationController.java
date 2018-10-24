package com.yushu.controller;

import com.yushu.model.CardOccupation;
import com.yushu.service.CardOccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/cardOccupation")
public class CardOccupationController {
    @Autowired
    CardOccupationService cardOccupationService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        CardOccupation cardOccupation = new CardOccupation();
        return cardOccupationService.getList(cardOccupation);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        CardOccupation cardOccupation = new CardOccupation();
        cardOccupation.setId(id);
        return cardOccupationService.get(cardOccupation);
    }
}
