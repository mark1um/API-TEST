package com.mtech.mtime.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
