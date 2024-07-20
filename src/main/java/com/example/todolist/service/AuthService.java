package com.example.todolist.service;

import com.example.todolist.web.dto.auth.JwtRequest;
import com.example.todolist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
