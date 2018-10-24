package com.yushu.service;

import com.yushu.model.CardOccupation;

import java.util.List;

public interface CardOccupationService {
    List<CardOccupation> getList(CardOccupation cardOccupation);
    CardOccupation get(CardOccupation cardOccupation);
}
