package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @Temporal(TemporalType.DATE)
    private java.util.Date dob;

    @Column
    private String quote;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "DATETIME")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Profile() {
    }

    public Profile(String fullName, Date dob, String quote, Timestamp createdDate, Timestamp modifiedDate, User user) {
        this.fullName = fullName;
        this.dob = dob;
        this.quote = quote;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
