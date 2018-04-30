package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String content;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private java.sql.Timestamp modifiedDate;

    // relationships...

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fad_id")
    private Fad fad;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

}
