package com.fan.cap5.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author fan
 * @create 2019-10-19 19:51
 * @description
 * @see
 */
public class DogImportSelect implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.fan.cap5.bean.Dog"};
    }
}
