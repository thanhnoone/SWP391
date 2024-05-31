package com.example.SWP391_Project.service;

import com.example.SWP391_Project.dto.MediaDto;
import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import com.example.SWP391_Project.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface AdminMediaService {

    List<Media> findByType(boolean type);

    List<Media> findByTypeAndRole(boolean type, Role.RoleDescription role);

    Media findMedia(int id);

    Media createAdminNotification(MediaDto mediaDto);

    Media createAdminPost(MediaDto mediaDto);

    Media updateMedia(int id, MediaDto mediaDto);

    void deleteMedia(int id);
}
