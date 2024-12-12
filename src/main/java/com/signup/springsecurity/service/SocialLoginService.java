package com.signup.springsecurity.service;

import org.springframework.stereotype.Service;
@Service
public class SocialLoginService {
   /* public String authenticateUser(String token) {
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new JacksonFactory())
                .setAudience(Collections.singletonList(CLIENT_ID))
                .build();
        try {
            GoogleIdToken idToken = verifier.verify(token);

            if (idToken != null) {
                // Extract user info
                GoogleIdToken.Payload payload = idToken.getPayload();
                String email = payload.getEmail();
                System.out.println("Email:" + email);
                // You can save the user to the database here or use any user management system
                return email; // return user info (email or username)
            } else {
                throw new IllegalArgumentException("Invalid ID token.");
            }

        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("Error while validating token", e);
        }
    }*/
}
