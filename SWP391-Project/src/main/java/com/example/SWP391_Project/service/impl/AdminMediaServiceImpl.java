package com.example.SWP391_Project.service.impl;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.model.User;
import com.example.SWP391_Project.reposity.MediaRepository;
import com.example.SWP391_Project.service.AdminMediaService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
    public boolean deleteMedia(int id) {
        try {
            mediaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void approveMedia(int mediaId) throws ServiceException {
        try {
            Media media = mediaRepository.findById(mediaId).orElseThrow(() -> new ServiceException("Media not found with ID: " + mediaId));
            media.setStatus(true);
            mediaRepository.save(media);
        } catch (DataAccessException e) {
            throw new ServiceException("Failed to approve media with ID: " + mediaId, e);
        }
    }

    @Override
    public void rejectMedia(int mediaId) throws ServiceException {
        try {
            mediaRepository.deleteById(mediaId); // --> Xóa luôn khỏi database !!
        } catch (DataAccessException e) {
            throw new ServiceException("Failed to reject media with ID: " + mediaId, e);
        }
    }
}


