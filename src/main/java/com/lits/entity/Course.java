package com.lits.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
