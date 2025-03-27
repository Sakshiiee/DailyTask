package com.CRUD1.services;

import com.CRUD1.entities.Student;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student save(Student student);

    void delete(Long id);

    Student update(Long id, Student student);

    Student findById(Long id);

}
