package com.CRUD1.services;

import com.CRUD1.entities.Student;
import com.CRUD1.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentSeviceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Student update(Long id, Student student) {
        Optional<Student> studentUpdate = studentRepository.findById(id);
        if (studentUpdate.isPresent()) {
            Student student1 = studentUpdate.get();
            student1.setName(student.getName());
            student1.setDepartment(student.getDepartment());
            student1.setMarks(student.getMarks());
            return studentRepository.save(student1);
        }
        return null;
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> studentbyId = studentRepository.findById(id);
        if (studentbyId.isPresent()) {
            return studentbyId.get();
        }
        return null;
    }
}
