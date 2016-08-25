package com.warrior.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "weapontype")
public class WeaponType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String weaponType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "weaponType")
    private List<Unit> unitList;

    public WeaponType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String type) {
        this.weaponType = type;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> weaponList) {
        this.unitList = weaponList;
    }
}
