package com.sachin.userapi.repository;

import com.sachin.userapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    // Custom method to search for a user by email before saving
    Optional<User> findByEmail(String email);
}
