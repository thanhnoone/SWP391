package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
//    int findById(int id);
    User findByEmail(String email);
    User findByEmailAndCode(String email, int code);

    List<User> findByRole_Id(int roleId);
    long countByRole_Id(int roleId);



    @Modifying

    @Transactional
    @Query("UPDATE User u SET u.accStatus  = :status WHERE u.id = :id")
    void updateUserStatus(@Param("id") int id, @Param("status") boolean status);

    @Query("SELECT u FROM User u WHERE u.role.id = 1 AND u.id IN (SELECT uc.user.id FROM UserCenter uc WHERE uc.center.manager.id = :managerId)")
    List<User> findStudentsByManagerId(@Param("managerId") int managerId);
}
