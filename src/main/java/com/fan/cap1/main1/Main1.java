package com.fan.cap1.main1;

import com.fan.cap1.bean.Student;
import com.fan.cap1.config.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fan
 * @create 2019-10-10 21:29
 * @description
 * @see
 */
public class Main1 {
    public static void main(String[] args) {
        //xml
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = (Student) application.getBean("stu");
        Student stu2 = (Student) application.getBean("stu");
        System.out.println(stu);
        System.out.println(stu == stu2);

        //注解
        ApplicationContext app = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        System.out.println("app init....");
        Student getStudent = (Student) app.getBean("getStudent");
        Student getStudent2 = (Student) app.getBean("getStudent");
        System.out.println(getStudent);
        System.out.println(getStudent == getStudent2);
    }
}
