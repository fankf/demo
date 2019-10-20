package com.fan.cap5.config;

import com.fan.cap5.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author fan
 * @create 2019-10-19 20:37
 * @description
 * @see
 */
public class MonkeyFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
