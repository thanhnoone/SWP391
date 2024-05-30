package com.example.SWP391_Project.controller.media;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.service.impl.AdminMediaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    List<Media> getAllNotications() {
        return adminMediaServiceImpl.findByType(false);
    }

    @GetMapping("/posts")
    List<Media> getAllPosts() {
        return adminMediaServiceImpl.findByType(true);
    }

    @GetMapping("/managerNotifications")
    List<Media> getManagerNotications() {
        return adminMediaServiceImpl.
                findMediaByTypeAndRole(false, Role.RoleDescription.MANAGER);
    }

    @GetMapping("/managerPosts")
    List<Media> getManagerPosts() {
        return adminMediaServiceImpl.
                findMediaByTypeAndRole(true, Role.RoleDescription.MANAGER);
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

