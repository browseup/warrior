package com.warrior.entity;

import javax.persistence.*;

@Entity
@Table(name = "unittype")
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "age")
    private int age;

    @JoinColumn(name = "type")
    @OneToMany
    private String type;
}
