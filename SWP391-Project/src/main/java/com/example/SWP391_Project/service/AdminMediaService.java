package com.example.SWP391_Project.service;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminMediaService {

    List<Media> findByType(boolean type);

    List<Media> findByTypeAndRole(boolean type, Role.RoleDescription role);

    Media findMedia(int id);

    Media createAdminNotification(MediaDto mediaDto);

    Media createAdminPost(MediaDto mediaDto);

    Media updateMedia(int id, MediaDto mediaDto);

    boolean deleteMedia(int id);

    void approveMedia(int mediaId);

    void rejectMedia(int mediaId);
}
