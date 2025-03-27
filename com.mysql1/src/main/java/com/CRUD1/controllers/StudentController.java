package com.CRUD1.controllers;

import com.CRUD1.entities.Student;
import com.CRUD1.services.StudentService;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
///@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private Student student;

    @GetMapping(value = "/students")
    //@RequestMapping(value = "/student", method = HttpMethod.GET)
    public List<Student> findAll() {
   /*     log.info("student: {}", student);*/
        System.out.println("Student: "+student);
        return studentService.findAll();
    }

    @PostMapping("/students")
    public ResponseEntity<Student>  save(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student)) ;
    }

    @PutMapping("/students/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id,
                                @RequestParam(value = "name")  String name) {
        studentService.delete(id);
        return "Deleted Successfully";
    }

    @GetMapping("/students/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }





}
