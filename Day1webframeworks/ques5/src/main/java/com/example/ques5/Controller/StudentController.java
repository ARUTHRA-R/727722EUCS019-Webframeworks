package com.example.ques5.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques5.Model.Student;

@RestController
public class StudentController {
@GetMapping("/student")
public List<Student> Appinfo(){
     List<Student> student=new ArrayList<>();
     Student obj=new Student();
     obj.setStudentName("John");
     obj.setMessage("Welcome,John");
     student.add(obj);
     return student;
}
}

