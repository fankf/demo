package com.fan.cap5.config;

import com.fan.cap5.bean.Pig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author fan
 * @create 2019-10-19 20:05
 * @description 自定义注册Java bean 到spring中，放入@Import
 * 只有Cat 和Dog 已经放入之后放入Pig
 * @see
 */
public class PigImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean catExist = registry.containsBeanDefinition("com.fan.cap5.bean.Cat");
        boolean dogExist = registry.containsBeanDefinition("com.fan.cap5.bean.Dog");
        if (catExist && dogExist) {
            BeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", beanDefinition);
        }
    }
}
