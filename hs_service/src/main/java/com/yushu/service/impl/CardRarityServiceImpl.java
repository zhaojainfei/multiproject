package com.yushu.service.impl;

import com.yushu.mapper.CardRarityMapper;
import com.yushu.model.CardRarity;
import com.yushu.service.CardRarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardRarityServiceImpl implements CardRarityService {
    @Autowired
    CardRarityMapper cardRarityMapper;

    @Override
    public List<CardRarity> getList(CardRarity cardRarity) {
        return null;
    }

    @Override
    public CardRarity get(CardRarity cardRarity) {
        return null;
    }
}
