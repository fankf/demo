package com.fan.cap9.bean;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import java.util.Set;

/**
 * @Author fankunfeng
 * @Date 2019-10-21 11:01:55
 * @Describe
 */
@Component
public class Sun implements EmbeddedValueResolverAware, ImportAware {
    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String s = stringValueResolver.resolveStringValue("你好：#{123-12}岁的小明，你的鸟是${bird.color}");
        System.out.println(s);
    }

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        for (String annotationType : annotationTypes) {
            System.out.println("已有的注解：" + annotationType);
        }
    }
}
