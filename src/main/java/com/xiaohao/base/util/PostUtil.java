package com.xiaohao.base.util;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: xiaohao
 * Date: 12-12-3
 * Time: 下午6:17
 * To change this template use File | Settings | File Templates.
 */
public class PostUtil {
    public static String doPost(String url2,NameValuePair[] data){
        String responseStr="";
        HttpClient httpClient = new HttpClient();

        PostMethod postMethod = new PostMethod(url2);
        // 将表单的值放入postMethod中
        postMethod.setRequestBody(data);

        // 执行postMethod
        int statusCode = 0;
        try {
            statusCode = httpClient.executeMethod(postMethod);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // HttpClient对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发
        // 301或者302
        if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY
                || statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
            // 从头中取出转向的地址
            Header locationHeader = postMethod.getResponseHeader("location");
            String location = null;
            if (locationHeader != null) {
                location = locationHeader.getValue();
                responseStr="The page was redirected to:" + location;
            } else {
                responseStr="Location field value is null.";
            }
            return responseStr;
        } else {

            try {
                responseStr = postMethod.getResponseBodyAsString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        postMethod.releaseConnection();
        return responseStr;
    }
}
