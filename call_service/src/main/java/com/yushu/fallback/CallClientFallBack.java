package com.yushu.fallback;

import com.yushu.service.CallClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CallClientFallBack implements CallClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Object getHero() {
        logger.error("getHero - 服务出异常了");
        return null;
    }

    @Override
    public Object getHeroById(Integer id) {
        logger.error("getHeroById - 服务出异常了");
        return null;
    }
}
