package com.yushu.service;

import com.yushu.model.Card;

import java.util.List;

public interface CardService {
    List<Card> getList(Card card);
    Card get(Card card);
}
