package com.ics.demo.CAT1;

import com.ics.demo.spring.FeignClient;
import com.ics.demo.CAT1.Models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RunningClass implements CommandLineRunner {
    private final FeignClass feignRestClient;


    public RunningClass(FeignClass feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {


        Student newSt = new Student("095070","Mutuma");
        newSt = feignRestClient.createStudent(newSt);
        System.out.println("Create movie:"+newSt.toString());
    }
}
