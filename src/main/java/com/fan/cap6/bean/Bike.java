package com.fan.cap6.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author fan
 * @create 2019-10-19 19:30
 * @description
 * @see
 */
public class Bike implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println(" Bike  destroy() .....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" Bike afterPropertiesSet() ...");
    }
}
