package com.codeup.fadlister.models;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.List;

@Entity
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

}
