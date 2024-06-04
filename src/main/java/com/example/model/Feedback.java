package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "t06_feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C06_FEEDBACK_ID")
    private int id;

    @Column(name = "C06_FEEDBACK_DESC", nullable = false)
    private String description;

    @Column(name = "C06_USER_ID", nullable = false)
    private int userId;

    @Column(name = "C06_SEND_TO", nullable = false)
    private String sendTo;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }
}
