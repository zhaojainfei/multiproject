package com.yushu.service.impl;

import com.yushu.mapper.CardTypeMapper;
import com.yushu.model.CardType;
import com.yushu.service.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardTypeServiceImpl implements CardTypeService {
    @Autowired
    CardTypeMapper cardTypeMapper;

    @Override
    public List<CardType> getList(CardType cardType) {
        List<CardType> list = cardTypeMapper.select(cardType);
        return list;
    }

    @Override
    public CardType get(CardType cardType) {
        List<CardType> list = getList(cardType);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}
