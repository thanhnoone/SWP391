package com.example.SWP391_Project.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "t05_role")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {
    @Id
    @Column(name = "C05_ROLE_ID")
    int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "C05_ROLE_DESC", nullable = false)
    RoleDescription description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    List<User> users;

    public enum RoleDescription {
        STUDENT,
        PARENT,
        TEACHER,
        MANAGER,
        ADMIN
    }
}
