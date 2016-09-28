package com.warrior.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit_type")
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String unitType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy= "unitType")
    private List<Unit> unitList;

    public UnitType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String type) {
        this.unitType = type;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> listType) {
        this.unitList = listType;
    }
}
