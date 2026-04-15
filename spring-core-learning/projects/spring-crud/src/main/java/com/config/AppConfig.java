package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.service.StudentService;

@Configuration
public class AppConfig {
    @Bean
    public StudentService studentService() {
        return new StudentService();
    }
}
