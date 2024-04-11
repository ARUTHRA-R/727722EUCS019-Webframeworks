package com.example.ques2.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("Var1")
    private String name;
    @JsonProperty("Var2")
    private int age;

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
}