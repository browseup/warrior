package com.warrior.entity;

import javax.persistence.*;

@Entity
@Table(name = "unit")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "unittype_id")
    private UnitType unitType;

    @ManyToOne
    @JoinColumn(name = "weapontype_id")
    private WeaponType weaponType;



    public Unit() {
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

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType type) {
        this.unitType = type;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weapon_type) {
        this.weaponType = weapon_type;
    }
}
