package com.fan.cap1.config;

import com.fan.cap1.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author fan
 * @create 2019-10-10 21:58
 * @description
 * @see
 */
@Configuration
public class AnnotationConfig {
    /**
     *  Scope "singleton" 单实例
     *        "prototype" 多实例
     *        "request"
     *        "session"
      * @return
     */

//    @Scope("prototype")
    @Bean
//    @Lazy
    public Student getStudent() {
        System.out.println("init....");
        return new Student("fankf","123");
    }
}
