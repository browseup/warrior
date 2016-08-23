package com.warrior.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Magician {
    @Id
    private int id;
    private String name;
    private int age;
    private String description;

    public Magician() {
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
}
