package com.example.todolist.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {

    private Long userId;
    private Long username;
    private String accessToken;
    private String refreshToken;
}
