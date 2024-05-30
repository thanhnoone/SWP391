package com.example.SWP391_Project.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.multipart.MultipartFile;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MediaDto {

    @Size(min = 10, message = "The title should be at least 10 characters")
    @Size(max = 200, message = "The title cannot exceed 2000 characters")
    String title;

    @Size(min = 60, message = "The content should be at least 10 characters")
    @Size(max = 2000, message = "The content cannot exceed 2000 characters")
    String content;

    @NotEmpty(message = "The email is required")
    @Size(max = 100, message = "SendTo field cannot exceed 100 characters")
    String sendTo;
}
