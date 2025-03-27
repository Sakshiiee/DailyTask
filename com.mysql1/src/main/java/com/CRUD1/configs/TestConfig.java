package com.CRUD1.configs;

import com.CRUD1.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public Student getStudent() {
        Student student = new Student();
        student.setName("Sakshi");
        student.setDepartment("Java");
        return student;
    }
}
