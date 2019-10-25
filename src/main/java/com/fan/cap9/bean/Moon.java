package com.fan.cap9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author fankunfeng
 * @Date 2019-10-21 11:01:55
 * @Describe
 */
@Component
public class Moon implements ApplicationContextAware, BeanFactoryAware, EnvironmentAware, BeanNameAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory: " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String key : beanDefinitionNames) {
            System.out.println("bean: " + key);
        }
    }

    @Override
    public void setEnvironment(Environment environment) {
        String property = environment.getProperty("bird.color");
        System.out.println(property);
    }
}
