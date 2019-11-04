package com.fan.cap9.config;

import com.fan.cap9.aspect.CalAspect;
import com.fan.cap9.bean.Calculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fan
 * @create 2019-10-23 21:37
 * @description
 * @see
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap9MainConfig {
    @Bean
    public Calculate calculate(){
        return new Calculate();
    }

    @Bean
    public CalAspect calAspect(){
        return new CalAspect();
    }
}
