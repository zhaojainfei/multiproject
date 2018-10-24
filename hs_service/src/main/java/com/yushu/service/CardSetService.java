package com.yushu.service;

import com.yushu.model.CardSet;

import java.util.List;

public interface CardSetService {
    List<CardSet> getList(CardSet cardSet);
    CardSet get(CardSet cardSet);
}
