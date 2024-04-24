package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.AruthraCourse;
import com.examly.class_exercise_2.service.AruthraCourseService;

@RestController
public class AruthraCourseController {

     @Autowired
     public AruthraCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AruthraCourse> postMethodName(@RequestBody AruthraCourse entity) {

          AruthraCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AruthraCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AruthraCourse>> getMethodName() {

          List<AruthraCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AruthraCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AruthraCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AruthraCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}