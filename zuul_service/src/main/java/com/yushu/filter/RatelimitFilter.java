package com.yushu.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

// 限流 - 谷歌开源框架guava - 往桶里放100个令牌，每个request请求都进去拿走一个令牌，如果拿空了就代表访问频率过高
@Component
public class RatelimitFilter extends ZuulFilter {
    // 每秒产生100个令牌
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(1);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return -4;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String url = "/apigateway/call/getCardById";
        if(url.equals(request.getRequestURI())){
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        // 从木桶中拿一个令牌
        if(!RATE_LIMITER.tryAcquire()){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.TOO_MANY_REQUESTS.value());
        }
        return null;
    }
}
