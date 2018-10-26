package com.yushu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yushu.service.CallClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CallController {
    private static final Logger logger = LoggerFactory.getLogger(CallController.class);

    @Autowired
    private CallClient callClient;

    // 熔断 - 剔除挂了的服务，别让调用者再去调用该服务 - 过一段时间再去调用，如果可用那么恢复服务的剔除状态
    // 异常处理 - 降级(让用户体验完整流程，部分非主要服务可不调取) - 如果出现异常进行方法回调(比如我们把hs_service服务停掉)
    @RequestMapping(value = "getHero",method = RequestMethod.GET)
    public Object getCard(){
        logger.info("client调用方法 - getHero");
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getHero());
        return map;
    }

    @RequestMapping(value = "getHeroById",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="saveOrderFail")
    public Object getCardById(Integer id){
        // 第二次调用接口不打印链路追踪，这样就可以打印了
        logger.info("client调用方法 - getCardById");
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getHeroById(id));
        return map;
    }

    private Object saveOrderFail(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg","错误信息");
        return map;
    }
}
