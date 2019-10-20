package com.fan.cap6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author fan
 * @create 2019-10-20 19:29
 * @description
 * @see
 */
@Component
public class PlaneBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PlaneBeanPostProcessor postProcessBeforeInitialization 被使用了 ..."+ beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PlaneBeanPostProcessor postProcessAfterInitialization 被使用了 ..."+ beanName);

        return bean;
    }
}
