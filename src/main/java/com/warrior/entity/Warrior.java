package com.warrior.entity;

/**
 * Created by alexey_n on 22.08.2016.
 */

public class Warrior {
    private int id;
    private String name;
    private int age;
    private String description;

    public Warrior() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}