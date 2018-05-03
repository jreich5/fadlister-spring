package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "flags")
public class Flag {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "is_active")
    private boolean isActive;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name = "fad_id")
    private Fad fad;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Flag() {
    }

    public Flag(boolean isActive, User sender, Comment comment, Fad fad, User user) {
        this.isActive = isActive;
        this.sender = sender;
        this.comment = comment;
        this.fad = fad;
        this.user = user;
    }

    public Flag(boolean isActive, Timestamp createdDate, Timestamp modifiedDate, User sender, Comment comment, Fad fad, User user) {
        this.isActive = isActive;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.sender = sender;
        this.comment = comment;
        this.fad = fad;
        this.user = user;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
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
