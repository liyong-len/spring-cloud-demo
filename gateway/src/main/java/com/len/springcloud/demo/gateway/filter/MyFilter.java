package com.len.springcloud.demo.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyFilter
 * @Description MyFilter
 * @Author liyong
 * @Date 2020/7/24 16:11
 * @Version 1.0
 */
public class MyFilter extends ZuulFilter {

    /**
     * 过滤器的类型，它决定过滤器在请求的哪个生命周期中执行。 这里定义为pre，代表会在请求被路由之前执行
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter执行顺序，通过数字指定。 数字越大，优先级越低
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断该过滤器是否需要被执行。这里我们直接返回了true，
     * 因此该过滤器对所有请求都会生效。 实际运用中我们可以利用该函数来指定过滤器的有效范围。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String name = request.getParameter("name");
        /**
         * 将请求参数转换为大写
         * */
        name = name.toUpperCase();
        request.setAttribute("name", name);
        requestContext.setRequest(request);
        return null;
    }
}
