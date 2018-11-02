package com.yushu.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class HttpUtils {
    public static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    private static RestTemplate restTemplate;
    static {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10000);
        restTemplate = new RestTemplate(requestFactory);
    }

    /**
     * 发送GET请求
     * @param url
     * @param resType
     * @return
     */
    public static Object doGet(String url, Class resType){
        logger.info("GET request for {}", url);
        // 发送get请求
        Class entity = (Class)restTemplate.getForObject(url, resType);
        logger.info("GET response : {}", JSONObject.toJSONString(entity));
        return entity;
    }

    /**
     * 发送POST请求
     * @param url
     * @param param
     * @param resType
     * @return
     */
    public static Object doPost(String url, MultiValueMap<String, String> param, Class resType){
        logger.info("GET request for {}", url);
        // 头信息
        HttpHeaders headers = new HttpHeaders();
        // 请求实体
        HttpEntity<MultiValueMap<String, String>> requestEntity  = new HttpEntity<>(param, headers);
        // 发送post请求
        Class entity = (Class)restTemplate.postForObject(url, requestEntity, resType);
        logger.info("POST response : {}", JSONObject.toJSONString(entity));
        return entity;
    }
}
