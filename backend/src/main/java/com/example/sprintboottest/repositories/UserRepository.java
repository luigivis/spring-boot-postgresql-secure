package com.example.sprintboottest.repositories;

import com.example.sprintboottest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
