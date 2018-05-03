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

    public NotificationMessage() {
    }

    public NotificationMessage(String name, String message) {
        this.name = name;
        this.message = message;
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

}
