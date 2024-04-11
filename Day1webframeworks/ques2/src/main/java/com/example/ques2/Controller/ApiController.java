package com.example.ques2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/studentName")
     public String greet(@RequestParam String studentName){
        return "Welcome "+ studentName+"!";
     }
}
