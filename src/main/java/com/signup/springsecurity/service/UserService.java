package com.signup.springsecurity.service;

import com.signup.springsecurity.repository.UserRepository;
import com.signup.springsecurity.util.KeyGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import com.signup.springsecurity.entity.User;
@Service
public class UserService {
    private final String SECRET_KEY = KeyGeneratorUtil.getBase64Key();
    @Autowired
    private UserRepository userRepository;
    public UserService() throws NoSuchAlgorithmException {
    }

    /*public String generateToken(String username) {
        SecretKey key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(SECRET_KEY));
        System.out.println("generated token key: " + key);
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                .signWith(key)
                .compact();
    }

    public String encryptToken(String token) {
        String encryptedToken = Jwts.builder()
                .setPayload(token)
                .setHeaderParam("alg", "A256GCM")
                .compact();
        return encryptedToken;
    }
    public Boolean validateToken(String token, String username) {
        System.out.println("inside validate token method:" + username);
        try{
            Jwts.parserBuilder().setSigningKey(SECRET_KEY).build()
                    .parseClaimsJws(token);
            System.out.println("inside token method:" + extractUsername(username) + ", flag: " + extractUsername(username).equals(username));
            if(extractUsername(token).equals(username)){
                System.out.println("inside token method:" + extractUsername(username) + ", flag: " + extractUsername(username).equals(username));
                return true;
            } else {
                System.out.println("inside token method:" + extractUsername(username) + ", flag: " + extractUsername(username).equals(username));
                return false;
            }
        }catch (Exception e) {
            return false;
        }
    }

    private String extractUsername(String token) {
        String str = Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();  // The username is stored as the subject of the JWT
        System.out.println("----str:" + str);
        return str;
    }

    public String getSecretKey(){
        return SECRET_KEY;
    }
*/
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
