package com.example.SWP391_Project.controller.media;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.response.MediaResponse;
import com.example.SWP391_Project.service.impl.AdminMediaServiceImpl;
import jakarta.validation.Valid;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminMediaController {

    @Autowired
    private AdminMediaServiceImpl adminMediaServiceImpl;

    @PostMapping("/notification")
    public Media createNotification(@RequestBody @Valid MediaDto mediaDto) {
        return adminMediaServiceImpl.createAdminNotification(mediaDto);
    }

    @PostMapping("/post")
    public Media createPost(@RequestBody @Valid MediaDto mediaDto) {
        return adminMediaServiceImpl.createAdminPost(mediaDto);
    }

    // false --> notification --> 0 in database
    // true --> post --> 1 in database

    @GetMapping("/notifications")
    public ResponseEntity<List<MediaResponse>> getAllNotications() {
        List<MediaResponse> mediaResponses = new ArrayList<>();
        List<Media> medias = adminMediaServiceImpl.findByType(false);
        for(Media media : medias) {
            MediaResponse mediaResponse = new MediaResponse(
                      media.getId(),
                      media.getTitle(),
                      media.getContent(),
                      media.isType(),
                      media.isStatus(),
                      media.getPublishedDate(),
                      media.getSendTo(),
                      media.getUser().getName());
            mediaResponses.add(mediaResponse);
        }
        return ResponseEntity.ok().body(mediaResponses);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<MediaResponse>> getAllPosts() {
        List<MediaResponse> mediaResponses = new ArrayList<>();
        List<Media> medias = adminMediaServiceImpl.findByType(true);
        for(Media media : medias) {
            MediaResponse mediaResponse = new MediaResponse(
                      media.getId(),
                      media.getTitle(),
                      media.getContent(),
                      media.isType(),
                      media.isStatus(),
                      media.getPublishedDate(),
                      media.getSendTo(),
                      media.getUser().getName());
            mediaResponses.add(mediaResponse);
        }
        System.out.println(mediaResponses.get(0).isStatus());
        return ResponseEntity.ok().body(mediaResponses);
    }

    @GetMapping("/managerNotifications")
    public ResponseEntity<List<Media>> getManagerNotications() {
        List<Media> mediaList = adminMediaServiceImpl
                .findByTypeAndRole(false, Role.RoleDescription.MANAGER);
        return ResponseEntity.ok().body(mediaList);
    }

    @GetMapping("/managerPosts")
    public ResponseEntity<List<Media>> getManagerPosts() {
        List<Media> mediaList = adminMediaServiceImpl.
                findByTypeAndRole(true, Role.RoleDescription.MANAGER);
        return ResponseEntity.ok().body(mediaList);
    }

    // update a post or notification base on id
    @PutMapping("/{mediaId}")
    public ResponseEntity<Media> updateMedia(@PathVariable int mediaId, @RequestBody @Valid MediaDto mediaDto) {
        Media updatedMedia = adminMediaServiceImpl.updateMedia(mediaId, mediaDto);
        if (updatedMedia != null) {
            return ResponseEntity.ok(updatedMedia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{mediaId}")
    public ResponseEntity<String> deleteMedia(@PathVariable int mediaId) {
        boolean deleted = adminMediaServiceImpl.deleteMedia(mediaId);
        if (deleted) {
            return ResponseEntity.ok("Deleted user where ID = " + mediaId);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("approve/{mediaId}")
    public ResponseEntity<?> approveMedia(@PathVariable int mediaId) {
        try {
            adminMediaServiceImpl.approveMedia(mediaId);
            return ResponseEntity.ok().body("Media approved successfully");
        } catch (ServiceException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to approve media: " + e.getMessage());
        }
    }

    @DeleteMapping("reject/{mediaId}")
    public ResponseEntity<?> rejectMedia(@PathVariable int mediaId) {
        try {
            adminMediaServiceImpl.rejectMedia(mediaId);
            return ResponseEntity.ok().body("Media rejected successfully");
        } catch (ServiceException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to reject media: " + e.getMessage());
        }
    }

}

