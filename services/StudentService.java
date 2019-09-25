package com.ics.demo.CAT1.services;

import com.ics.demo.CAT1.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);
    void delete(Long id);
    Student update (Student student);
    Student update(Long id, Student student);
    Student create(Student movie);
}
