package com.fan.cap6.config;

import com.fan.cap6.bean.Bike;
import com.fan.cap6.bean.Car;
import com.fan.cap6.bean.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fan
 * @create 2019-10-20 12:58
 * @description
 * @see
 */
@Configuration
@ComponentScan("com.fan.cap6.bean")
public class Cap6Config {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        System.out.println("car 被初始化了 ... ");
        return new Car();
    }

    @Bean
    public Bike bike() {
        System.out.println(" BIke 被初始化了 。。。。");
        return new Bike();
    }

    @Bean
    public Plane plane() {
        System.out.println(" Plane 被初始化了 。。。。");
        return new Plane();
    }
}
