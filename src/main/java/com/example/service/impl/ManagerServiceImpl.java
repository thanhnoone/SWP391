package com.example.service.impl;

import com.example.model.Manager;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserCenter;
import com.example.repository.ManagerRepository;
import com.example.repository.FeedbackRepository;
import com.example.repository.UserCenterRepository;
import com.example.repository.UserRepository;
import com.example.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private UserCenterRepository userCenterRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public Optional<Manager> findById(int id) {
        return managerRepository.findById(id);
    }

    @Override
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteById(int id) {
        managerRepository.deleteById(id);
    }

    @Override
    public List<Feedback> findAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public Optional<Feedback> findFeedbackById(int id) {
        return feedbackRepository.findById(id);
    }

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public void deleteFeedbackById(int id) {
        feedbackRepository.deleteById(id);
    }

    @Override
    public List<User> findStudentsByManagerId(int managerId) {
        return userRepository.findStudentsByManagerId(managerId);
    }

    @Override
    public List<User> findUsersByManagerId(int managerId) {
        List<UserCenter> userCenters = userCenterRepository.findUsersByCenterId(managerId);
        return userCenters.stream().map(UserCenter::getUser).collect(Collectors.toList());
    }
}
