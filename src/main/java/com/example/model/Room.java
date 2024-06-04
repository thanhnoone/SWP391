package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "t18_room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "C18_STATUS", nullable = false)
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "C18_CENTER_ID", nullable = false)
    private Center center;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
}
