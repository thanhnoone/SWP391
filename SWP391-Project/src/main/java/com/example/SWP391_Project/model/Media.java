package com.example.SWP391_Project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
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

    @Column(name = "C11_PUBLISHED_DATE", nullable = false)
    Date publishedDate;

    @Column(name = "C11_SEND_TO", nullable = false)
    String sendTo;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C11_ACTOR_ID", referencedColumnName = "C14_USER_ID")
    User user;
}
