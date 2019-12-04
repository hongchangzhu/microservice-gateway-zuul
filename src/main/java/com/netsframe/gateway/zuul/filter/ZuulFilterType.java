package com.netsframe.gateway.zuul.filter;

public enum ZuulFilterType {
    PRE("pre", "前置过滤器"),
    ROUTE("route", "路由请求过滤器"),
    POST("post", "在目标请求返回后执行"),
    ERROR("error", "处理请求时发生错误时被调用"),
    ;
    private String type;
    private String desc;

    ZuulFilterType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
