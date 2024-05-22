package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t14_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C14_USER_ID")
    private Long id;

    @Column(name = "C14_USER_USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "C14_USER_PASSWORD", nullable = false)
    private String password;

    @Column(name = "C14_ACC_STATUS", nullable = false)
    private boolean accountStatus;

    @Column(name = "C14_USER_CODE", nullable = false, unique = true)
    private int userCode;

    @Column(name = "C14_USER_NAME", nullable = false)
    private String name;

    @Column(name = "C14_USER_PHONE", nullable = false)
    private String phone;

    @Column(name = "C14_USER_ADDRESS", nullable = false)
    private String address;

    @Column(name = "C14_USER_DOB", nullable = false)
    private Date dateOfBirth;

    @Column(name = "C14_USER_GENDER", nullable = false)
    private boolean gender;

    @Column(name = "C14_USER_EMAIL", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "C14_ROLE_ID", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "C14_PARENT_ID")
    private User parent;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }
}
