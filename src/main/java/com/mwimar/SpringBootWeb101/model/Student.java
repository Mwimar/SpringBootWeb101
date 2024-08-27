package com.mwimar.SpringBootWeb101.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
