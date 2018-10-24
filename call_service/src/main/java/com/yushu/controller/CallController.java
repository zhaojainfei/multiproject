package com.yushu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yushu.service.CallClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CallController {
    @Autowired
    private CallClient callClient;

    @RequestMapping(value = "getCard",method = RequestMethod.GET)
    public Object getCard(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCard());
        return map;
    }
    @RequestMapping(value = "getCardById",method = RequestMethod.GET)
    public Object getCardById(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardById(id));
        return map;
    }

    @RequestMapping(value = "getCardKind",method = RequestMethod.GET)
    public Object getCardKind(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardKind());
        return map;
    }
    @RequestMapping(value = "getCardKindById",method = RequestMethod.GET)
    // 熔断 - 剔除挂了的服务，别让调用者再去调用该服务 - 过一段时间再去调用，如果可用那么恢复服务的剔除状态
    // 异常处理 - 降级(让用户体验完整流程，部分非主要服务可不调取) - 如果出现异常进行方法回调(比如我们把hs_service服务停掉)
    @HystrixCommand(fallbackMethod="saveOrderFail")
    public Object getCardKindById(Integer id){
//        String key = "key";
//        Object value = redisTemplate.opsForValue().get(key);
//        new Thread(()->{
//            if(StringUtils.isEmpty(value)){
//                redisTemplate.opsForValue().set(key,"value",20, TimeUnit.SECONDS);
//                System.out.println("报警，发送短信");
//            }else{
//                System.out.println("20秒内不重复发送报警");
//            }
//        }).start();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardKindById(id));
        return map;
    }
    private Object saveOrderFail(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg","错误信息");
        return map;
    }

    @RequestMapping(value = "getCardOccupation",method = RequestMethod.GET)
    public Object getCardOccupation(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardOccupation());
        return map;
    }
    @RequestMapping(value = "getCardOccupationById",method = RequestMethod.GET)
    public Object getCardOccupationById(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardOccupationById(id));
        return map;
    }

    @RequestMapping(value = "getCardRarity",method = RequestMethod.GET)
    public Object getCardRarity(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardRarity());
        return map;
    }
    @RequestMapping(value = "getCardRarityById",method = RequestMethod.GET)
    public Object getCardRarityById(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardRarityById(id));
        return map;
    }

    @RequestMapping(value = "getCardSet",method = RequestMethod.GET)
    public Object getCardSet(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardSet());
        return map;
    }
    @RequestMapping(value = "getCardSetById",method = RequestMethod.GET)
    public Object getCardSetById(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardSetById(id));
        return map;
    }

    @RequestMapping(value = "getCardType",method = RequestMethod.GET)
    public Object getCardType(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardType());
        return map;
    }
    @RequestMapping(value = "getCardTypeById",method = RequestMethod.GET)
    public Object getCardTypeById(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",callClient.getCardTypeById(id));
        return map;
    }
}
