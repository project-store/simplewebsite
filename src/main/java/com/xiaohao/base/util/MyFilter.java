package com.xiaohao.base.util;

import javax.servlet.*;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-3
 * Time: 下午6:37
 * To change this template use File | Settings | File Templates.
 */
public class MyFilter implements Filter {
    private String[] adminPath;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String pathes = filterConfig.getInitParameter("adminPath");
        adminPath = pathes.split("\n");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
