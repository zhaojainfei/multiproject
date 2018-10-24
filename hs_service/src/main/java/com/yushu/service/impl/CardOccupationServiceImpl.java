package com.yushu.service.impl;

import com.yushu.mapper.CardOccupationMapper;
import com.yushu.model.CardOccupation;
import com.yushu.service.CardOccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardOccupationServiceImpl implements CardOccupationService {
    @Autowired
    CardOccupationMapper cardOccupationMapper;

    @Override
    public List<CardOccupation> getList(CardOccupation cardOccupation) {
        List<CardOccupation> list = cardOccupationMapper.select(cardOccupation);
        return list;
    }

    @Override
    public CardOccupation get(CardOccupation cardOccupation) {
        List<CardOccupation> list = getList(cardOccupation);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}
