package com.yushu.service.impl;

import com.yushu.mapper.CardKindMapper;
import com.yushu.model.CardKind;
import com.yushu.service.CardKindService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardKindServiceImpl implements CardKindService {
    @Autowired
    CardKindMapper cardKindMapper;

    @Override
    public List<CardKind> getList(CardKind cardKind) {
        List<CardKind> list = cardKindMapper.select(cardKind);
        return list;
    }

    @Override
    public CardKind get(CardKind cardKind) {
        List<CardKind> list = cardKindMapper.select(cardKind);
        if (list.size() == 1){
            CardKind hsCardkind = list.get(0);
            CardKind cardTemp = new CardKind();
            // 克隆所有属性
            // 双开项目的方法 - EditConfiguration 编辑里面-Dserver.port=8771 然后把上面那个single去掉
            BeanUtils.copyProperties(hsCardkind,cardTemp);
            return cardTemp;
        }
        return null;
    }
}
