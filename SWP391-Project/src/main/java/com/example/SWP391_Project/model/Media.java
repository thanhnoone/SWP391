package com.example.SWP391_Project.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "t11_manager_admin_media")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C11_ID")
    int id;

    @Column(name = "C11_TITLE", nullable = false)
    String title;

    @Column(name = "C11_CONTENT", nullable = false)
    String content;

    @Column(name = "C11_TYPE", nullable = false)
    boolean type;

    @Column(name = "C11_MEDIA_STATUS")
    boolean status; // default = false

    @Column(name = "C11_PUBLISHED_DATE", nullable = false)
    Date publishedDate;

    @Column(name = "C11_SEND_TO", nullable = false)
    String sendTo;

    @ManyToOne
    @JoinColumn(name = "C11_ACTOR_ID")
    @JsonManagedReference
    User user;

    public Media(int id, String title, String content, boolean type, boolean status, Date publishedDate, String sendTo) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
        this.type = type;
        this.publishedDate = publishedDate;
        this.sendTo = sendTo;
    }
}

// Trigger JPA !! --> Auto reload
