package com.fan.cap1.config;

import com.fan.cap1.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fan
 * @create 2019-10-10 21:58
 * @description
 * @see
 */
@Configuration
public class AnnotationConfig {

    @Bean
    public Student getStudent() {
        return new Student("fankf","123");
    }
}
