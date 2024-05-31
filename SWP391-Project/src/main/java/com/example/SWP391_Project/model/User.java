package com.example.SWP391_Project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "t14_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C14_USER_ID")
    int id;

    @Column(name = "C14_USER_USERNAME", nullable = false)
    String username;

    @Column(name = "C14_USER_PASSWORD", nullable = false)
    String password;

    @Column(name = "C14_ACC_STATUS", nullable = false)
    boolean status;

    @Column(name = "C14_USER_CODE", nullable = false)
    int code;

    @Column(name = "C14_USER_NAME", nullable = false)
    String name;

    @Column(name = "C14_USER_PHONE", nullable = false)
    String phone;

    @Column(name = "C14_USER_ADDRESS", nullable = false)
    String address;

    @Column(name = "C14_USER_DOB", nullable = false)
    LocalDate dob;

    @Column(name = "C14_USER_GENDER", nullable = false)
    boolean gender;

    @Column(name = "C14_USER_EMAIL", nullable = false)
    String email;

    @Column(name = "C14_VERIFICATION_CODE", nullable = false)
    String verificationCode;

    @Column(name = "C14_PROFILE_IMAGE", nullable = false)
    String profileImage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C14_ROLE_ID", referencedColumnName = "C05_ROLE_ID", nullable = false)
    Role role;

    @ManyToOne
    @JoinColumn(name = "C14_PARENT_ID", referencedColumnName = "C14_USER_ID")
    User parent;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonBackReference
    List<Media> medias;



    }
