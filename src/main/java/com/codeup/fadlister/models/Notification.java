package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "custom_message")
    private String customMessage;

    @CreationTimestamp
    @Column(name = "created_at")
    private java.sql.Timestamp createdDate;

    @Column(name = "received_at", columnDefinition="DATETIME")
    @Temporal(TemporalType.DATE)
    private java.util.Date receivedAt;

    // relationships...

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "notification")
    @JoinColumn(name = "notification_message_id")
    private NotificationMessage notificationMessage;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "notification")
    @JoinColumn(name = "status_code_id")
    private StatusCode statusCode;

    public Notification() {
    }

    public Notification(String customMessage, Timestamp createdDate, Date receivedAt, User user, NotificationMessage notificationMessage, StatusCode statusCode) {
        this.customMessage = customMessage;
        this.createdDate = createdDate;
        this.receivedAt = receivedAt;
        this.user = user;
        this.notificationMessage = notificationMessage;
        this.statusCode = statusCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Date getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NotificationMessage getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(NotificationMessage notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
