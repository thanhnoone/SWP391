package com.example.SWP391_Project.service.impl;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.model.User;
import com.example.SWP391_Project.reposity.MediaReposity;
import com.example.SWP391_Project.service.AdminMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminMediaServiceImpl implements AdminMediaService {

    @Autowired
    private MediaReposity mediaReposity;

    @Override
    public List<Media> findByType(boolean type) {
        return mediaReposity.findByType(type);
    }

    @Override
    public List<Media> findMediaByTypeAndRole(boolean type, Role.RoleDescription role) {
        return mediaReposity.findMediaByTypeAndRole(type, role);
    }

    @Override
    public Media createAdminNotification(MediaDto mediaDto) {
        Media media = Media.builder()
                .title(mediaDto.getTitle())
                .content(mediaDto.getContent())
                .type(false)
                .publishedDate(new Date())
                .sendTo(mediaDto.getSendTo())
                .user(User.builder().id(5).build())
                .build();
        return mediaReposity.save(media);
    }

    @Override
    public Media createAdminPost(MediaDto mediaDto) {
        Media media = Media.builder()
                .title(mediaDto.getTitle())
                .content(mediaDto.getContent())
                .type(true)
                .publishedDate(new Date())
                .sendTo(mediaDto.getSendTo())
                .user(User.builder().id(5).build())
                .build();
        return mediaReposity.save(media);
    }

    @Override
    public Media findMedia(int id) {
        return mediaReposity
                .findById(id)
                .orElseThrow(() -> new RuntimeException("The media hasnt been existed !!"));
    }

    @Override
    public Media updateMedia(int id, MediaDto mediaDto) {
        Media media = findMedia(id);

        media.setTitle(mediaDto.getTitle());
        media.setContent(mediaDto.getContent());
        media.setPublishedDate(new Date());
        media.setSendTo(mediaDto.getSendTo());
        media.setUser(User.builder().id(5).build());

        return mediaReposity.save(media);
    }

    @Override
    public void deleteMedia(int id) {
        mediaReposity.deleteById(id);
    }
}

//// get user by Id
//public User getUser(String id) {
//    return userRepository
//            .findById(id)
//            .orElseThrow(() -> new RuntimeException("User not found!!!!"));
//}
//
//// update user's information
//public User updateUser(String userId, UserUpdateRequest request) {
//    User userToBeUpdated = getUser(userId);
