package com.CRUD1.repositories;

import com.CRUD1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNameOrDepartment(String name, String department);


    @Query(value = "select s student from student where s.name = :name")
    @Query(value = "selct * from student", nativeQuery = true)
    List<Student> find(String name);
}
