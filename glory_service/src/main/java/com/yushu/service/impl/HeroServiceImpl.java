package com.yushu.service.impl;

import com.yushu.mapper.HeroMapper;
import com.yushu.model.Hero;
import com.yushu.service.CardKindService;
import com.yushu.service.HeroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    HeroMapper heroMapper;

    @Override
    public List<Hero> getList(Hero hero) {
        List<Hero> list = heroMapper.select(hero);
        return list;
    }

    @Override
    public Hero get(Hero hero) {
        List<Hero> list = heroMapper.select(hero);
        if (list.size() == 1){
            return list.get(0);
        }
        return null;
    }
}
