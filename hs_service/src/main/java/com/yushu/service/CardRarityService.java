package com.yushu.service;

import com.yushu.model.CardRarity;

import java.util.List;

public interface CardRarityService {
    List<CardRarity> getList(CardRarity cardRarity);
    CardRarity get(CardRarity cardRarity);
}
