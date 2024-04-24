package com.example.relation.Aruthracontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.Aruthramodel.AruthraStudent;
import com.example.relation.Aruthraservice.AruthraStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AruthraStudentController {
    public AruthraStudentService studentService;
    public AruthraStudentController(AruthraStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AruthraStudent postMethodName(@RequestBody AruthraStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AruthraStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
