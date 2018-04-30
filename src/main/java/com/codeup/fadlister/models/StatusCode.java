package com.codeup.fadlister.models;

import javax.persistence.*;

@Entity
@Table(name="status_codes")
public class StatusCode {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    // relationships...

    @OneToOne
    @JoinColumn(name = "notfication_id")
    private Notification notification;

}
