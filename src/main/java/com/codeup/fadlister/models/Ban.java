package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "bans")
public class Ban {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String log;

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
    @JoinColumn(name = "admin_id")
    private User admin;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
