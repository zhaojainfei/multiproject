package com.yushu.fallback;

import com.yushu.service.CallClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CallClientFallBack implements CallClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Object getCard() {
        logger.error("getCard - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardById(Integer id) {
        logger.error("getCardById - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardKind() {
        logger.error("getCardKind - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardKindById(Integer id) {
        logger.error("getCardKindById - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardOccupation() {
        logger.error("getCardOccupation - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardOccupationById(Integer id) {
        logger.error("getCardOccupationById - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardRarity() {
        logger.error("getCardRarity - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardRarityById(Integer id) {
        logger.error("getCardRarityById - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardSet() {
        logger.error("getCardSet - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardSetById(Integer id) {
        logger.error("getCardSetById - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardType() {
        logger.error("getCardType - 服务出异常了");
        return null;
    }

    @Override
    public Object getCardTypeById(Integer id) {
        logger.error("getCardTypeById - 服务出异常了");
        return null;
    }
}
