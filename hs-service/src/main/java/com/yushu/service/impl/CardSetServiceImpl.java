package com.yushu.service.impl;

import com.yushu.mapper.CardOccupationMapper;
import com.yushu.mapper.CardSetMapper;
import com.yushu.model.CardSet;
import com.yushu.service.CardSetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardSetServiceImpl implements CardSetService {
    @Autowired
    CardSetMapper cardSetMapper;

    @Override
    public List<CardSet> getList(CardSet cardSet) {
        List<CardSet> list = cardSetMapper.select(cardSet);
        return list;
    }

    @Override
    public CardSet get(CardSet cardSet) {
        List<CardSet> list = getList(cardSet);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}
