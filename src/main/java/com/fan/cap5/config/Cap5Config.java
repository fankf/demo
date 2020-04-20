package com.fan.cap5.config;

import com.fan.cap4.bean.Person;
import com.fan.cap5.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author fan
 * @create 2019-10-19 19:29
 * @description @Import com.fan.cap5.bean.Dog 自动注入容器，名称为全类名
 * @see
 */
@Configuration
@Import(value = {Cat.class, DogImportSelect.class, PigImportBeanDefinitionRegistrar.class})
public class Cap5Config {
    @Bean("person")
    public Person person() {
        return new Person("gyb", 2);
    }

    @Bean("monkeyFactoryBean")
    public MonkeyFactoryBean monkeyFactoryBean() {
        return new MonkeyFactoryBean();
    }
}
