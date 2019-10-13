package com.fan.cap3.config;

import com.fan.cap3.IFilterType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author fan
 * @create 2019-10-13 23:16
 * @description
 * @see
 */
@Configuration
@ComponentScan(value = "com.fan.cap3", useDefaultFilters = false,
        includeFilters = {
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = Controller.class)
//        @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = TestController.class)
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = IFilterType.class)
        }
)
public class Main3Config {

}
