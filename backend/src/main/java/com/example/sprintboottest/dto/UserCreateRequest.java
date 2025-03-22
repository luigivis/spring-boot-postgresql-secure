package com.example.sprintboottest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {
    private String name;
    private String roles;
    private String region;
    private String department;
    private String email;
    private String password;
    private String gender;
}
