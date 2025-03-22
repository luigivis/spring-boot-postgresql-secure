package com.example.sprintboottest.service;

import com.example.sprintboottest.dto.UserCreateRequest;
import com.example.sprintboottest.models.Users;
import com.example.sprintboottest.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;

    public Users createUser(UserCreateRequest user) {
        var entity = Users.builder()
                .name(user.getName())
                .roles(user.getRoles())
                .region(user.getRegion())
                .department(user.getDepartment())
                .email(user.getEmail())
                .password(user.getPassword())
                .gender(user.getGender())
                .build();
        return userRepository.save(entity);
    }
}
