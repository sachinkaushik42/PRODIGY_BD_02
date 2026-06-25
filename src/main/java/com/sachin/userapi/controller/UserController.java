package com.sachin.userapi.controller;

import com.sachin.userapi.model.User;
import com.sachin.userapi.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    // Constructor Injection replaces @Autowired and clears the yellow warning completely!
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Fulfills REST API / Data Ingestion requirement (POST)
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Email is already registered!");
        }
        User savedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    // Fulfills Reading Data requirement (GET)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
