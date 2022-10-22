package com.example.oauth2.config.auth.dto;

import com.example.oauth2.domain.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String username;
    private String email;

    public SessionUser(User user) {
        this.username = user.getName();
        this.email = user.getEmail();
    }
}
