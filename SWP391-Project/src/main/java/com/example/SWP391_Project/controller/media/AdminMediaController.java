package com.example.SWP391_Project.controller.media;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.response.MediaResponse;
import com.example.SWP391_Project.service.impl.AdminMediaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminMediaController {

    @Autowired
    private AdminMediaServiceImpl adminMediaServiceImpl;

    @PostMapping("/notification")
    Media createNotification(@RequestBody @Valid MediaDto mediaDto) {
        return adminMediaServiceImpl.createAdminNotification(mediaDto);
    }

    @PostMapping("/post")
    Media createPost(@RequestBody @Valid MediaDto mediaDto) {
        return adminMediaServiceImpl.createAdminPost(mediaDto);
    }

    // false --> notification --> 0 in database
    // true --> post --> 1 in database

    @GetMapping("/notifications")
    List<MediaResponse> getAllNotications() {
        List<MediaResponse> mediaResponses = new ArrayList<>();
        List<Media> medias = adminMediaServiceImpl.findByType(false);
        for(Media media : medias) {
            MediaResponse mediaResponse = new MediaResponse(
                      media.getId(),
                      media.getTitle(),
                      media.getContent(),
                      media.isType(),
                      media.getPublishedDate(),
                      media.getSendTo(),
                      media.getUser().getName());
            mediaResponses.add(mediaResponse);
        }
        return mediaResponses;
    }

    @GetMapping("/posts")
    List<MediaResponse> getAllPosts() {
        List<MediaResponse> mediaResponses = new ArrayList<>();
        List<Media> medias = adminMediaServiceImpl.findByType(true);
        for(Media media : medias) {
            MediaResponse mediaResponse = new MediaResponse(
                      media.getId(),
                      media.getTitle(),
                      media.getContent(),
                      media.isType(),
                      media.getPublishedDate(),
                      media.getSendTo(),
                      media.getUser().getName());
            mediaResponses.add(mediaResponse);
        }
        return mediaResponses;
    }

    @GetMapping("/managerNotifications")
    List<Media> getManagerNotications() {
        return adminMediaServiceImpl.
                findByTypeAndRole(false, Role.RoleDescription.MANAGER);
    }

    @GetMapping("/managerPosts")
    List<Media> getManagerPosts() {
        return adminMediaServiceImpl.
                findByTypeAndRole(true, Role.RoleDescription.MANAGER);
    }

    // update a post or notification base on id
    @PutMapping("/{mediaId}")
    Media updateMedia(@PathVariable int mediaId, @RequestBody @Valid MediaDto mediaDto) {
        return adminMediaServiceImpl.updateMedia(mediaId, mediaDto);
    }

    @DeleteMapping("/{mediaId}")
    String deleteUser(@PathVariable int mediaId) {
        adminMediaServiceImpl.deleteMedia(mediaId);
        return "Deleted user where ID = " + mediaId;
    }
}

