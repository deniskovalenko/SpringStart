package com.springapp.mvc;

/**
 * Created by Денис on 9/15/2014.
 */
public class Person {
    private Integer age;
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
