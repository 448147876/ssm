package com.ssm.common;

import com.ssm.controller.UserController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * @description: spring工具类
 * @Author: 童志杰
 * @date: 2018/5/8 17:24
 */
public class SpringManageUtils {

    /**
     * 根据类返回spring容器中的bean
     * @param cla
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> cla) {
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        T bean = wac.getBean(cla);
        return bean;
    }

}
