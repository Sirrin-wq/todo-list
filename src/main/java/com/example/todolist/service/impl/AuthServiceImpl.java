package com.example.todolist.service.impl;

import com.example.todolist.service.AuthService;
import com.example.todolist.web.dto.auth.JwtRequest;
import com.example.todolist.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
