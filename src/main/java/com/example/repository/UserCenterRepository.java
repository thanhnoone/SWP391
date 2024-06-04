package com.example.repository;

import com.example.model.UserCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserCenterRepository extends JpaRepository<UserCenter, Integer> {

    @Query("SELECT uc FROM UserCenter uc WHERE uc.center.id = :centerId")
    List<UserCenter> findUsersByCenterId(@Param("centerId") int centerId);
}
