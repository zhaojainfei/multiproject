package com.yushu.service;

import com.yushu.model.CardKind;

import java.util.List;

public interface CardKindService {
    List<CardKind> getList(CardKind cardKind);
    CardKind get(CardKind cardKind);
}
