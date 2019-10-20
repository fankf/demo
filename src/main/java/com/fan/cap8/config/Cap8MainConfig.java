package com.fan.cap8.config;

import com.fan.cap8.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author fan
 * @create 2019-10-20 21:06
 * @description
 * @see
 */
@Configuration
@ComponentScan(value = {"com.fan.cap8.controller","com.fan.cap8.service","com.fan.cap8.dao"})
public class Cap8MainConfig {
    @Bean("testDao")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}


