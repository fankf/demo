package com.fan.cap7.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author fan
 * @create 2019-10-20 20:15
 * @description
 * @see
 */
public class Bird {
    @Value("fankf")
    private String name;
    @Value("#{13+2}")
    private Integer age;
    @Value("${bird.color}")
    private String color;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Bird() {
    }

    public Bird(String name, Integer age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
