package com.ics.demo.CAT1.repositories;

import com.ics.demo.CAT1.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<Student, Long> {
}
