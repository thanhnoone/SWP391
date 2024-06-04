package com.example.controller;

import com.example.model.Manager;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    // Manager CRUD methods

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Manager> getManagerById(@PathVariable int id) {
        return managerService.findById(id);
    }

    @PostMapping
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.save(manager);
    }

    @PutMapping("/{id}")
    public Manager updateManager(@PathVariable int id, @RequestBody Manager managerDetails) {
        Optional<Manager> optionalManager = managerService.findById(id);
        if (optionalManager.isPresent()) {
            Manager manager = optionalManager.get();
            manager.setName(managerDetails.getName());
            manager.setCode(managerDetails.getCode());
            manager.setDescription(managerDetails.getDescription());
            manager.setStartDate(managerDetails.getStartDate());
            manager.setEndDate(managerDetails.getEndDate());
            manager.setAmountOfStudents(managerDetails.getAmountOfStudents());
            manager.setFee(managerDetails.getFee());
            manager.setCenterId(managerDetails.getCenterId());
            manager.setSubjectId(managerDetails.getSubjectId());
            manager.setTeacherId(managerDetails.getTeacherId());
            return managerService.save(manager);
        } else {
            throw new RuntimeException("Manager not found with id " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteManager(@PathVariable int id) {
        managerService.deleteById(id);
    }

    // Feedback CRUD methods

    @GetMapping("/feedbacks")
    public List<Feedback> getAllFeedbacks() {
        return managerService.findAllFeedbacks();
    }

    @GetMapping("/feedbacks/{id}")
    public Optional<Feedback> getFeedbackById(@PathVariable int id) {
        return managerService.findFeedbackById(id);
    }

    @PostMapping("/feedbacks")
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        return managerService.saveFeedback(feedback);
    }

    @PutMapping("/feedbacks/{id}")
    public Feedback updateFeedback(@PathVariable int id, @RequestBody Feedback feedbackDetails) {
        Optional<Feedback> optionalFeedback = managerService.findFeedbackById(id);
        if (optionalFeedback.isPresent()) {
            Feedback feedback = optionalFeedback.get();
            feedback.setDescription(feedbackDetails.getDescription());
            feedback.setUserId(feedbackDetails.getUserId());
            feedback.setSendTo(feedbackDetails.getSendTo());
            return managerService.saveFeedback(feedback);
        } else {
            throw new RuntimeException("Feedback not found with id " + id);
        }
    }

    @DeleteMapping("/feedbacks/{id}")
    public void deleteFeedback(@PathVariable int id) {
        managerService.deleteFeedbackById(id);
    }

    @GetMapping("/{managerId}/students")
    public ResponseEntity<?> getStudentsByManager(@PathVariable int managerId) {
        try {
            List<User> users = managerService.findUsersByManagerId(managerId);
            return ResponseEntity.ok(users);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Manager with ID " + managerId + " not found.");
        }
    }
}
