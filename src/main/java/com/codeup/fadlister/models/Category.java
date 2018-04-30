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

}
