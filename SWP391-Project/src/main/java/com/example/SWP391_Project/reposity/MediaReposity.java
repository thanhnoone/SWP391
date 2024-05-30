package com.example.SWP391_Project.reposity;

import com.example.SWP391_Project.model.Media;
import com.example.SWP391_Project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaReposity extends JpaRepository<Media, Integer> {

    // get "all posts" or "all notifications"
    @Query("SELECT m FROM Media m " +
            "JOIN m.user u " +
            "JOIN u.role r " +
            "WHERE m.type = :type")
    List<Media> findByType(@Param("type") boolean type);

    // get manager's posts or notifications
    // get admin's posts or notifications
    @Query("SELECT m FROM Media m " +
            "JOIN m.user u " +
            "JOIN u.role r " +
            "WHERE m.type = :type AND r.description = :role")
    List<Media> findMediaByTypeAndRole(@Param("type") boolean type, @Param("role") Role.RoleDescription role);
}
