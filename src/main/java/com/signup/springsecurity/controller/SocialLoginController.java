package com.signup.springsecurity.controller;

import com.signup.springsecurity.service.SocialLoginService;
import com.signup.springsecurity.util.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SocialLoginController {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private SocialLoginService socialLoginService; // Service to handle social login logic

    /*@PostMapping("/social-login")
    public ResponseEntity<?> socialLogin(@RequestBody SocialLoginRequest socialLoginRequest) {
        String token = socialLoginRequest.getToken();

        // Authenticate user using the token (verify with Google)
        String username = socialLoginService.authenticateUser(token);
        // Generate JWT token
        String jwtToken = jwtTokenProvider.createSocialToken(username);

        return ResponseEntity.ok(new JwtResponse(jwtToken));
    }*/

}
