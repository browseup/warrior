package com.warrior.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unittype")
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String unitType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy= "unitType")
    private List<Unit> UnitList;

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
        return UnitList;
    }

    public void setUnitList(List<Unit> listType) {
        this.UnitList = listType;
    }
}
