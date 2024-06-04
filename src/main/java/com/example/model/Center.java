package com.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t03_center")
public class Center {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C03_CENTER_ID")
    private int id;

    @Column(name = "C03_CENTER_CODE", nullable = false, unique = true)
    private int code;

    @Column(name = "C03_CENTER_NAME", nullable = false)
    private String name;

    @Column(name = "C03_CENTER_DESC", nullable = false)
    private String description;

    @Column(name = "C03_CENTER_ADDRESS", nullable = false)
    private String address;

    @Column(name = "C03_CENTER_PHONE", nullable = false)
    private String phone;

    @Column(name = "C03_CENTER_EMAIL", nullable = false)
    private String email;

    @Column(name = "C03_CENTER_REGULATIONS", nullable = false)
    private String regulations;

    @Column(name = "C03_CREATED_AT", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "C03_IMAGE_PATH", nullable = false)
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "C03_MANAGER_ID", nullable = false)
    private User manager;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegulations() {
        return regulations;
    }

    public void setRegulations(String regulations) {
        this.regulations = regulations;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }
}
