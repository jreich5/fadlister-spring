package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

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


}
