package com.xiaohao.base.util;

import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.service.RandomWIshService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-4-4
 * Time: 下午4:57
 * To change this template use File | Settings | File Templates.
 */
public class RandomWishInitListenner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        RandomWIshService randomWIshService =(RandomWIshService)this.getBean(sce,"RandomWishServiceImpl");
        List<RandomWish> randomWishList = randomWIshService.loadRandomWishAll();
        List<Long> randomIdList = new ArrayList<Long>();
        Hashtable<Long,RandomWish> randomWishMap = new Hashtable();
        for(int i=0;i<randomIdList.size();i++){
            RandomWish temp = randomWishList.get(i);
            randomIdList.add(temp.getRandomWishId());
            randomWishMap.put(temp.getRandomWishId(),temp);
        }
        sce.getServletContext().setAttribute("RandomWishIdList",randomIdList);
        sce.getServletContext().setAttribute("RandomWishMap",randomWishMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    private Object getBean(ServletContextEvent context, String str) {
        WebApplicationContext wac = WebApplicationContextUtils
                .getRequiredWebApplicationContext(context.getServletContext());
        return wac.getBean(str);
    }
}
