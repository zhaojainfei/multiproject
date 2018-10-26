package com.yushu.service;

import com.yushu.fallback.CallClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "glory-service",fallback = CallClientFallBack.class)
public interface CallClient {
    @RequestMapping(value = "/glory/hero/get",method = RequestMethod.GET)
    Object getHero();

    @RequestMapping(value = "/glory/hero/getById",method = RequestMethod.GET)
    Object getHeroById(@RequestParam(value = "id",required = true) Integer id);
}
