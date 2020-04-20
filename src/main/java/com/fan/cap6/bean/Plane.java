package com.fan.cap6.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author fan
 * @create 2019-10-19 20:35
 * @description
 * @see
 */
public class Plane {
    public Plane() {
        System.out.println("Plane construct ....");
    }

    @PostConstruct
    public void init() {
        System.out.println(" Plane init ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(" Plane destroy ...");
    }
}
