package com.yushu.service.impl;

import com.yushu.mapper.CardMapper;
import com.yushu.model.Card;
import com.yushu.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    CardMapper cardMapper;

    @Override
    public List<Card> getList(Card card) {
        List<Card> list = cardMapper.select(card);
        return list;
    }

    @Override
    public Card get(Card card) {
        List<Card> list = this.getList(card);
        if(list.size() >0){
            return list.get(0);
        }
        return null;
    }
}
