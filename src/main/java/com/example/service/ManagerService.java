package com.example.service;

import com.example.model.Manager;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserCenter;

import java.util.List;
import java.util.Optional;

public interface ManagerService {

    List<Manager> findAll();

    Optional<Manager> findById(int id);

    Manager save(Manager manager);

    void deleteById(int id);

    // Feedback methods
    List<Feedback> findAllFeedbacks();

    Optional<Feedback> findFeedbackById(int id);

    Feedback saveFeedback(Feedback feedback);

    void deleteFeedbackById(int id);

    // User methods
    List<User> findStudentsByManagerId(int managerId);
    List<User> findUsersByManagerId(int managerId);  // Thêm phương thức này
}
