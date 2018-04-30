package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private byte rating;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    // fad id
    @ManyToOne
    @JoinColumn(name = "fad_id")
    private Fad fad;

    // user id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Rating() {
    }

    public Rating(byte rating, Timestamp createdDate, Timestamp modifiedDate, Fad fad, User user) {
        this.rating = rating;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.fad = fad;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
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

    public Fad getFad() {
        return fad;
    }

    public void setFad(Fad fad) {
        this.fad = fad;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
