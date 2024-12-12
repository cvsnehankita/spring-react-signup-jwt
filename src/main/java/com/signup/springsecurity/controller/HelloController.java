package com.signup.springsecurity.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Value("${PORT:8080}")
    private int port;
    @GetMapping("/hello")
    public String sayHello(){
     return "Hello, Welcome to my application";
    }
}

