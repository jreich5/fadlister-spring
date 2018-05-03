package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

    public Fad() {
    }

    public Fad(String name, String description, String decade, Image image, List<Category> categories) {
        this.name = name;
        this.description = description;
        this.decade = decade;
        this.image = image;
        this.categories = categories;
    }

    public Fad(String name, String description, String decade, Timestamp createdDate, Timestamp modifiedDate, List<Category> categories, List<Comment> comments, List<Flag> flags, List<Rating> ratings) {
        this.name = name;
        this.description = description;
        this.decade = decade;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.categories = categories;
        this.comments = comments;
        this.flags = flags;
        this.ratings = ratings;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDecade() {
        return decade;
    }

    public void setDecade(String decade) {
        this.decade = decade;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Flag> getFlags() {
        return flags;
    }

    public void setFlags(List<Flag> flags) {
        this.flags = flags;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
