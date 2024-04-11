package com.example.ques3.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ques3.Model.Student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Studentcontroller {

    @GetMapping("/student")
    public Student getStudentDetails() {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Vijay");
        stu.setDescription("This is a student description");
        return stu;
    }

}