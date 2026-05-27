package com.app.sistemas_web.controller;

import com.app.sistemas_web.model.User;
import com.app.sistemas_web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
}
