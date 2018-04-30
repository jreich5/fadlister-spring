package com.codeup.fadlister.models;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;

    @Column(name = "is_active")
    private boolean isActive;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    @OneToMany(mappedBy = "user")
    private List<Ban> bansReceived;

    @OneToMany(mappedBy = "user")
    private List<Ban> bansGiven;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Comment> comments;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Flag> flagsCreated;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Flag> flagsReceived;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    private List<Message> messagesCreated;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipient")
    private List<Message> messagessReceived;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Notification> notifications;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Rating> ratings;

    public User() {
    }

    public User(String username, String email, String password, Role role, boolean isActive, Timestamp createdDate, Timestamp modifiedDate, List<Ban> bansReceived, List<Ban> bansGiven, List<Comment> comments, Profile profile, List<Flag> flagsCreated, List<Flag> flagsReceived, List<Message> messagesCreated, List<Message> messagessReceived, List<Notification> notifications, List<Rating> ratings) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.bansReceived = bansReceived;
        this.bansGiven = bansGiven;
        this.comments = comments;
        this.profile = profile;
        this.flagsCreated = flagsCreated;
        this.flagsReceived = flagsReceived;
        this.messagesCreated = messagesCreated;
        this.messagessReceived = messagessReceived;
        this.notifications = notifications;
        this.ratings = ratings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<Ban> getBansReceived() {
        return bansReceived;
    }

    public void setBansReceived(List<Ban> bansReceived) {
        this.bansReceived = bansReceived;
    }

    public List<Ban> getBansGiven() {
        return bansGiven;
    }

    public void setBansGiven(List<Ban> bansGiven) {
        this.bansGiven = bansGiven;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Flag> getFlagsCreated() {
        return flagsCreated;
    }

    public void setFlagsCreated(List<Flag> flagsCreated) {
        this.flagsCreated = flagsCreated;
    }

    public List<Flag> getFlagsReceived() {
        return flagsReceived;
    }

    public void setFlagsReceived(List<Flag> flagsReceived) {
        this.flagsReceived = flagsReceived;
    }

    public List<Message> getMessagesCreated() {
        return messagesCreated;
    }

    public void setMessagesCreated(List<Message> messagesCreated) {
        this.messagesCreated = messagesCreated;
    }

    public List<Message> getMessagessReceived() {
        return messagessReceived;
    }

    public void setMessagessReceived(List<Message> messagessReceived) {
        this.messagessReceived = messagessReceived;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
