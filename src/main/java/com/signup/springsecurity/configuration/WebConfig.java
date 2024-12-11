package com.signup.springsecurity.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allow all paths
                .allowedOrigins("http://localhost:3000")  // Allow React app
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allow credentials (cookies, authentication)
    }
}
