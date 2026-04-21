package com.example.keycloakdemo.controllers;

import com.example.keycloakdemo.keycloak.KeycloakService;
import com.example.keycloakdemo.dto.request.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
@RequiredArgsConstructor
public class AuthController {

    private final KeycloakService keycloakService;

    @PostMapping("/register")
    public String register(@RequestBody UserRequestDto userRequestDto) {
        keycloakService.addUser(userRequestDto);
        return "User registered successfully with role " + userRequestDto.role();
    }
}
