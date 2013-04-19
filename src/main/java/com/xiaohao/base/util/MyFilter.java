package com.xiaohao.base.util;

import com.xiaohao.base.model.AdminUser;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;

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
        for (int i = 0; i < adminPath.length; i++) {
            adminPath[i] = adminPath[i].trim();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String url = req.getRequestURL().toString();
        for (int i = 0; i < adminPath.length; i++) {
            if (url.indexOf(adminPath[i]) > 0) {
                Object adminUser = req.getSession().getAttribute("adminUser");
                if (adminUser == null) {
                    req.getRequestDispatcher("/index.jsp").forward(req, response);
                    return;
                }
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
