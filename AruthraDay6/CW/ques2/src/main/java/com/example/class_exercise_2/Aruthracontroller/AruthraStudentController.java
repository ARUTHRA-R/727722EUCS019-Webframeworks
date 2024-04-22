package com.example.class_exercise_2.Aruthracontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.Aruthramodel.AruthraStudent;
import com.example.class_exercise_2.Aruthraservice.AruthraStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AruthraStudentController {

     @Autowired
     public AruthraStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AruthraStudent>> getDetails() {
          List<AruthraStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AruthraStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AruthraStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AruthraStudent> postMethodName(@RequestBody AruthraStudent student) {

          AruthraStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AruthraStudent>> sortedDetails(@PathVariable String field) {
          List<AruthraStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AruthraStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AruthraStudent>>(list, HttpStatus.OK);

     }
}
