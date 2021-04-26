package com.baizhi.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
/*
* ConfigurationProperties 告诉springboot将本类中的属性与配置文件中的属性一一绑定
* */
@ConfigurationProperties(prefix = "person")

public class Person {
    private String name;
    private int age;
    private Date date;
    private Map<String,Object> maps;
    private List<String> lists;
    private Dog dog;

    public Person() {
    }

    public Person(String name, int age, Date date, Map<String, Object> maps, List<String> lists, Dog dog) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
