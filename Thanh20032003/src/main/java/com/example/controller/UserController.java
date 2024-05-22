package com.example.controller;

import com.example.model.Role;
import com.example.model.User;
import com.example.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(Model model) {
        List<Role> roles = userService.findAllRoles();
        model.addAttribute("roles", roles);
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, @RequestParam int roleId, Model model, HttpSession session) {
        if (userService.authenticateUser(username, password, roleId)) {
            User user = userService.findByUsername(username);
            session.setAttribute("user", user);
            return "redirect:" + getRedirectUrlByRole(user.getRole().getDescription());
        }
        List<Role> roles = userService.findAllRoles();
        model.addAttribute("roles", roles);
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("roleId", roleId);
        model.addAttribute("error", "Invalid username, password, or role");
        return "login";
    }

    private String getRedirectUrlByRole(Role.RoleDescription role) {
        switch (role) {
            case STUDENT:
                return "/student";
            case PARENT:
                return "/parent";
            case TEACHER:
                return "/teacher";
            case MANAGER:
                return "/manager";
            case ADMIN:
                return "/admin";
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        List<Role> roles = userService.findAllRoles();
        model.addAttribute("roles", roles);
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, @RequestParam int roleId, Model model, HttpSession session) {
        if (userService.findByUsername(user.getUsername()) != null) {
            model.addAttribute("error", "Username already exists");
            return "register";
        }
        if (userService.findByEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Email already exists");
            return "register";
        }
        Role role = userService.findRoleById(roleId);
        user.setRole(role);
        user.setStatus(false); // Set user status to false until verification
        userService.saveUser(user);
        userService.sendVerificationCode(user);
        session.setAttribute("user", user);
        return "redirect:/verify-code";
    }

    @GetMapping("/verify-code")
    public String verifyCode(Model model) {
        model.addAttribute("verificationCode", "");
        return "verify-code";
    }

    @PostMapping("/verify-code")
    public String verifyCode(@RequestParam String verificationCode, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user != null && verificationCode.equals(user.getVerificationCode())) {
            user.setStatus(true); // Set user status to true after successful verification
            userService.saveUser(user);
            return "redirect:/login";
        }
        model.addAttribute("error", "Invalid verification code");
        return "verify-code";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword(Model model) {
        model.addAttribute("user", new User());
        return "forgot-password";
    }

    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestParam String email, @RequestParam int code, Model model, HttpSession session) {
        User user = userService.findByEmail(email);
        if (user == null || user.getCode() != code) {
            model.addAttribute("error", "No user found with this email and code");
            return "forgot-password";
        }
        userService.sendPasswordResetCode(user);
        session.setAttribute("user", user);
        return "redirect:/reset-password";
    }

    @GetMapping("/reset-password")
    public String resetPassword(Model model) {
        model.addAttribute("resetCode", "");
        model.addAttribute("newPassword", "");
        return "reset-password";
    }

    @PostMapping("/reset-password")
    public String resetPassword(@RequestParam String resetCode, @RequestParam String newPassword, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user != null && resetCode.equals(user.getVerificationCode())) {
            user.setPassword(BCrypt.hashpw(newPassword, BCrypt.gensalt()));
            userService.saveUser(user);
            return "redirect:/login";
        }
        model.addAttribute("error", "Invalid reset code");
        return "reset-password";
    }

    @GetMapping("/change-password")
    public String changePassword(Model model) {
        model.addAttribute("user", new User());
        List<Role> roles = userService.findAllRoles();
        model.addAttribute("roles", roles);
        return "change-password";
    }

    @PostMapping("/change-password")
    public String changePassword(@RequestParam String email, @RequestParam int code, @RequestParam int roleId,
                                 @RequestParam String currentPassword, @RequestParam String newPassword, HttpSession session, Model model) {
        User user = userService.findByEmail(email);
        if (user == null || user.getCode() != code || user.getRole().getId() != roleId || !BCrypt.checkpw(currentPassword, user.getPassword())) {
            model.addAttribute("error", "Invalid credentials");
            return "change-password";
        }
        user.setPassword(BCrypt.hashpw(newPassword, BCrypt.gensalt()));
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
