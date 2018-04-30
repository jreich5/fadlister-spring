package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String subject;

    @Column
    private String body;

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
    @JoinColumn(name = "recipient_id")
    private User recipient;


}
