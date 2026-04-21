package com.example.keycloakdemo.dto.request;

public record UserRequestDto(
        String username,
        String password,
        String role
) {
}
