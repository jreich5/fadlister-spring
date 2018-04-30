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

    public NotificationMessage() {
    }

    public NotificationMessage(String name, String message, Notification notification) {
        this.name = name;
        this.message = message;
        this.notification = notification;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
