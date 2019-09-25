package com.ics.demo.CAT1.Models;

import com.ics.demo.spring.models.Movie;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @NotNull(groups = Student.Update.class)
    private Long id;

    @Column(name = "studentNumber")
    @NotNull(groups = Student.Create.class)
    private String name;

    @Column(name = "firstName")
    private String firstName;

//    @Column(name = "firstName")
//    private String score;
//
//    @Column(name = "firstName")
//    private String attachment;

    public Student(@NotNull(groups = Create.class) String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
//        this.score = score;
//        this.attachment = attachment;
    }

    public Student(){

    }

//    public String getScore() {
//        return score;
//    }
//
//    public void setScore(String score) {
//        this.score = score;
//    }
//
//    public String getAttachment() {
//        return attachment;
//    }
//
//    public void setAttachment(String attachment) {
//        this.attachment = attachment;
//    }

    public Long getId()
    {return id;}


    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public interface Create{}

    public interface Update{}

    public String toString() {
        return "Student(" +
                "id="+id+
                ",StudentNumber='"+name+'\''+
                ",firstName='"+firstName+'\'';
    }
}
