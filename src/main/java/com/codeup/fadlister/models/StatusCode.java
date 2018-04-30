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

    public StatusCode() {
    }

    public StatusCode(String name, Notification notification) {
        this.name = name;
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

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
