package com.codeup.fadlister.models;

import javax.persistence.*;

@Entity
@Table(name = "notification_messages")
public class NotificationMessage {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String message;

    // relationships...

    @OneToOne
    @JoinColumn(name = "notification_id")
    private Notification notification;

}
