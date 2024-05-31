package com.example.SWP391_Project.service.impl;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.model.User;
import com.example.SWP391_Project.reposity.MediaRepository;
import com.example.SWP391_Project.service.AdminMediaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AdminMediaServiceImpl implements AdminMediaService {

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public List<Media> findByType(boolean type) {

         return mediaRepository.findByType(type);
    }

    @Override
    public List<Media> findByTypeAndRole(boolean type, Role.RoleDescription role) {
        return mediaRepository.findByTypeAndRole(type, role);
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
        return mediaRepository.save(media);
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
        return mediaRepository.save(media);
    }

    @Override
    public Media findMedia(int id) {
        return mediaRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("The media hasn't been existed !!"));
    }

    @Override
    public Media updateMedia(int id, MediaDto mediaDto) {
        Media media = findMedia(id);

        media.setTitle(mediaDto.getTitle());
        media.setContent(mediaDto.getContent());
        media.setPublishedDate(new Date());
        media.setSendTo(mediaDto.getSendTo());
        media.setUser(User.builder().id(5).build());

        return mediaRepository.save(media);
    }

    @Override
    public void deleteMedia(int id) {
        mediaRepository.deleteById(id);
    }
}


