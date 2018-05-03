package com.codeup.fadlister.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    // relationships...

    @ManyToMany(mappedBy = "categories")
    private List<Fad> fads;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, List<Fad> fads) {
        this.name = name;
        this.fads = fads;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fad> getFads() {
        return fads;
    }

    public void setFads(List<Fad> fads) {
        this.fads = fads;
    }
}
