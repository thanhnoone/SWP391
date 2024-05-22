package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t06_role")
public class Role {

    @Id
    @Column(name = "C06_ROLE_ID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "C06_ROLE_DESC", nullable = false)
    private RoleDescription roleDescription;

    @OneToMany(mappedBy = "role")
    private Set<User> users;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleDescription getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(RoleDescription roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}

enum RoleDescription {
    STUDENT, PARENT, TEACHER, MANAGER, ADMIN
}
