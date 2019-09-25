package com.ics.demo.CAT1;

import com.ics.demo.CAT1.Models.Student;
import com.ics.demo.spring.models.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "client",url = "10.51.10.111:1000")
public interface FeignClass {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);
}
