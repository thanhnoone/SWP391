package com.example.service;

import com.example.model.Role;
import com.example.model.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private JavaMailSender mailSender;

    public void saveUser(User user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Role findRoleById(int id) {
        return roleRepository.findById(id).orElse(null);
    }

    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public boolean authenticateUser(String username, String password, int roleId) {
        User user = findByUsername(username);
        return user != null && BCrypt.checkpw(password, user.getPassword()) && user.getRole().getId() == roleId;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void sendVerificationCode(User user) {
        String code = generateVerificationCode();
        user.setVerificationCode(code);
        userRepository.save(user);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());
        message.setSubject("Your Verification Code");
        message.setText("Your verification code is: " + code);
        mailSender.send(message);
    }

    public void sendPasswordResetCode(User user) {
        String code = generateVerificationCode();
        user.setVerificationCode(code);
        userRepository.save(user);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());
        message.setSubject("Your Password Reset Code");
        message.setText("Your password reset code is: " + code);
        mailSender.send(message);
    }

    private String generateVerificationCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }

    public void updateProfileImage(User user, MultipartFile image) throws IOException {
        if (!image.isEmpty()) {
            String uploadDir = "user-photos/" + user.getId();
            String fileName = image.getOriginalFilename();
            saveFile(uploadDir, fileName, image);
            user.setProfileImage(uploadDir + "/" + fileName);
            userRepository.save(user);
        }
    }

    public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (var inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath);
        } catch (IOException e) {
            throw new IOException("Could not save file: " + fileName, e);
        }
    }

    public User findByEmailAndCode(String email, int code) {
        return userRepository.findByEmailAndCode(email, code);
    }
}
