package com.yushu.controller;

import com.yushu.model.Hero;
import com.yushu.service.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/glory/hero")
public class HeroController {
    private static final Logger logger = LoggerFactory.getLogger(HeroController.class);

    @Value("${env}")
    private String env;
    @Value("${branch}")
    private String branch;

    @Autowired
    HeroService heroService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        logger.info(env + " " + branch);
        logger.info("service调用方法 - /glory/hero/get");
        Hero hero = new Hero();
        return heroService.getList(hero);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        logger.info("service调用方法 - /glory/hero/getById");
        Hero hero = new Hero();
        hero.setId(id);
        return heroService.get(hero);
    }
}
