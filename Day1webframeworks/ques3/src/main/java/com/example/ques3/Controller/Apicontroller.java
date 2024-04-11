
package com.example.ques3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
    @GetMapping("/favouriteColor")
     public String greet(@RequestParam String colour){
        return "My favourite colour is "+ colour+"!";
     }
}
