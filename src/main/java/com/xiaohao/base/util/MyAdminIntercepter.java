package com.xiaohao.base.util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-31
 * Time: 下午5:56
 * 实现自己的拦截器 用来拦截管理后台各个操作action 检验是否为管理员登陆
 */
public class MyAdminIntercepter implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Object adminUser =actionInvocation.getInvocationContext().getSession().get("adminUser");
        if(adminUser!=null){
            actionInvocation.invoke();
        }
        return null;
    }
}
