package com.signup.springsecurity.service;

import com.signup.springsecurity.repository.UserRepository;
import com.signup.springsecurity.util.KeyGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import com.signup.springsecurity.entity.User;
@Service
public class UserService {
    private final String SECRET_KEY = KeyGeneratorUtil.getBase64Key();
    @Autowired
    private UserRepository userRepository;
    public UserService() throws NoSuchAlgorithmException {
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
