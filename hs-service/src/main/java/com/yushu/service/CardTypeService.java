package com.yushu.service;

import com.yushu.model.CardType;

import java.util.List;

public interface CardTypeService {
    List<CardType> getList(CardType cardType);
    CardType get(CardType cardType);
}
