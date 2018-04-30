package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

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


}
