package com.netsframe.gateway.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.route.RibbonRoutingFilter;
import org.springframework.cloud.netflix.zuul.filters.route.SimpleHostRoutingFilter;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class PreRequestLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return ZuulFilterType.PRE.getType();
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RibbonRoutingFilter ribbonRoutingFilter;
        SimpleHostRoutingFilter simpleHostRoutingFilter;
//        DefaultFallbackProvider defaultFallbackProvider;
//        FallbackProvider fallbackProvider;
        ZuulFallbackProvider zuulFallbackProvider;
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info(String.format("send %s request to %s", request.getMethod(), request.getRequestURL()));
        return null;
    }
}
