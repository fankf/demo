package com.fan.cap9.reflect;

import java.lang.reflect.Method;

/**
 * @author fan
 * @create 2019-10-23 22:14
 * @description
 * @see
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.fan.cap9.bean.Calculate");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
        }
    }
}
