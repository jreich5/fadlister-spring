package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fads")
public class Fad {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String decade;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    @ManyToMany
    @JoinTable(
        name = "fads_categories",
        joinColumns = @JoinColumn(name = "fad_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fad")
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fad")
    private List<Flag> flags;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fad")
    private List<Rating> ratings;

}
