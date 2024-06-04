package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "t16_user_center")
public class UserCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C16_USER_CENTER_ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "C16_USER_ID", referencedColumnName = "C14_USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "C16_CENTER_ID", referencedColumnName = "C03_CENTER_ID")
    private Center center;
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
}
