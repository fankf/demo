package com.fan.cap7.config;

import com.fan.cap7.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author fan
 * @create 2019-10-20 20:15
 * @description
 * @see
 */
@PropertySource(value = "classpath:/bean.properties")
@Configuration
public class Cap7Config {
    @Bean
    public Bird bird() {
        return new Bird();
    }
}
