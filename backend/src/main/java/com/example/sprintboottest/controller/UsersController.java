package com.example.sprintboottest.controller;

import com.example.sprintboottest.dto.UserCreateRequest;
import com.example.sprintboottest.models.Users;
import com.example.sprintboottest.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users/")
@RequiredArgsConstructor
public class UsersController {

    private final UserServiceImpl userService;

    @PostMapping("create")
    public Users create(@RequestBody UserCreateRequest user) {
        return userService.createUser(user);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("Deleted user with id " + id);
    }
}
