package com.ics.demo.CAT1.services;

import com.ics.demo.CAT1.Models.Student;
import com.ics.demo.CAT1.repositories.StudentRepositories;
import com.ics.demo.spring.ApiNotFoundException;
import com.ics.demo.spring.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentService {

    private final StudentRepositories studentRepositories;

    public ServiceImpl(StudentRepositories studentRepositories) {
        this.studentRepositories = studentRepositories;
    }

    @Override
    public List<Student> findAll() {
        return studentRepositories.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepositories.findById(id).orElseThrow(()->
                new ApiNotFoundException("No record with id " + id + " found"));
    }

    @Override
    public void delete(Long id) {
        studentRepositories.deleteById(id);
    }

    @Override
    public Student update(Student student) {
        Student foundStudent = findById(student.getId());
        foundStudent.setName(student.getName());
        foundStudent.setFirstName(student.getFirstName());
//        foundStudent.setAttachment(student.getAttachment());
//        foundStudent.setScore(student.getScore());
        return studentRepositories.save(foundStudent);
    }

    @Override
    public Student update(Long id, Student student) {
        Student foundStudent = findById(id);
        foundStudent.setName(student.getName());
        foundStudent.setFirstName(student.getFirstName());
//        foundStudent.setAttachment(student.getAttachment());
//        foundStudent.setScore(student.getScore());
        return studentRepositories.save(foundStudent);
    }

    @Override
    public Student create(Student movie) {
        return studentRepositories.save(movie);
    }
}
