package com.warrior.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unittype")
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="type")
    private List<Unit> listType;

    public UnitType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Unit> getListType() {
        return listType;
    }

    public void setListType(List<Unit> listType) {
        this.listType = listType;
    }
}
