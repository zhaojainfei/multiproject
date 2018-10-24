package com.yushu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 过滤器类型 - 前置
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 值越小,过滤器越先执行
        return 1;
    }


    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String url = "/apigateway/call/getCardById";
        if(url.equals(request.getRequestURI())){
            return true;
        }
        // 过滤器是否生效
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            // 不再走下面的流程了
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }else{

        }
        return null;
    }
}
