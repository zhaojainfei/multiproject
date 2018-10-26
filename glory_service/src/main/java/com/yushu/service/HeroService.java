package com.yushu.service;

import com.yushu.model.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getList(Hero hero);
    Hero get(Hero hero);
}
