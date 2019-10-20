package com.fan.cap4.config;

import com.fan.cap4.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author fan
 * @create 2019-10-19 18:31
 * @description @Conditional 有选择性的注入容器中
 * @see
 */
@Configuration
public class Cap4Config {
    @Bean("person")
    public Person person() {
        System.out.println("Fan init ...");
        return new Person("Fan", 123);
    }

    @Conditional(WinCondition.class)
    @Bean("marry")
    public Person Marry() {
        System.out.println("Marry init ...");
        return new Person("Marry", 123);
    }

    @Conditional(LinuxCondition.class)
    @Bean("james")
    public Person James() {
        System.out.println("james init ...");
        return new Person("James", 123);
    }
}
