package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

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

}
