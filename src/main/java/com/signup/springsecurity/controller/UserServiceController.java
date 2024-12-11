package com.signup.springsecurity.controller;

import com.signup.springsecurity.dto.Signin;
import com.signup.springsecurity.entity.JwtResponse;
import com.signup.springsecurity.entity.User;
import com.signup.springsecurity.util.JwtTokenProvider;
import com.signup.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/v1")
public class UserServiceController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody Signin user) {
        if(user == null){
            return ResponseEntity.status(401).body("Please enter valid username");
        }
        String username = user.getUsername();
        User existingUser = userService.findByEmail(username) != null ? userService.findByEmail(username) : userService.findByUsername(username);
        if ((existingUser != null) && existingUser.getPassword().trim().equals(user.getPassword().trim())) {
            String token = tokenProvider.createToken(existingUser);
            return ResponseEntity.ok(new JwtResponse(token));
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        User existingUser = userService.findByEmail(user.getEmail());
        user.setEmail(user.getEmail().toLowerCase().trim());
        if(existingUser == null){
            userService.saveUser(user);
            return ResponseEntity.ok("User created successfully");
        } else {
            return ResponseEntity.status(401).body("User already exists, please login.");
        }
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
}
