package com.example.bidirection.Aruthracontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.Aruthramodel.AruthraStudent;
import com.example.bidirection.Aruthramodel.AruthraStudentInfo;
import com.example.bidirection.Aruthraservice.AruthraStudentService;

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
    @PostMapping("/api/poststudent")
    public AruthraStudent postMethodName(@RequestBody AruthraStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AruthraStudentInfo postMethodName(@RequestBody AruthraStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AruthraStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}