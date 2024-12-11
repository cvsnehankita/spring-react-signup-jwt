package com.signup.springsecurity.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Signin {

    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
}
