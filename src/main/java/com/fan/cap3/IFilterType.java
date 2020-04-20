package com.fan.cap3;

import com.fan.cap3.controller.TestController;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author fan
 * @create 2019-10-13 23:27
 * @description 自定义TypeFilter 实现 @CompementScan 下 @Filter 的Filter类型
 * @see
 */
public class IFilterType implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        System.out.println("--->annotationMetadata:  " + annotationMetadata.getClassName());
        //获取当前扫描类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println("--->classMetadata:  " + classMetadata.getClassName());
        //获取类路径
        Resource resource = metadataReader.getResource();
        System.out.println("--->resource:  " + resource.getFilename());

        if (classMetadata.getClassName().contains("troll")) {
            System.out.println("<=======================>");
            return true;
        }
        return false;
    }
}
