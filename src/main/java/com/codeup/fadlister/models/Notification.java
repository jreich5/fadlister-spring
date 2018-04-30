package com.codeup.fadlister.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

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

}
