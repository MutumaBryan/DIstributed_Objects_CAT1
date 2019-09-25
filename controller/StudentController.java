package com.ics.demo.CAT1.controller;


import com.ics.demo.CAT1.Models.Student;
import com.ics.demo.CAT1.services.StudentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController  {

    private final StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> findAll(){
        return studentservice.findAll();
    }

    @GetMapping(value = "{id}")
    public Student findById(@PathVariable Long id){
        return studentservice.findById(id);
    }

    @PostMapping
    public Student create(@Validated({Student.Create.class}) @RequestBody Student student){
        return studentservice.create(student);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id){
        studentservice.delete(id);
    }

    @PatchMapping(value = "{id}")
    public Student update(@Validated(Student.Update.class) @PathVariable Long id, @RequestBody Student student){
        return studentservice.update(id, student);
    }
}
