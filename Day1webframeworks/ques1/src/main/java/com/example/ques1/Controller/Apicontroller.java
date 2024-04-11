
package com.example.ques1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
   @GetMapping("/Welcome")
        public String aruthra (){
            return "Welcome Spring Boot!"; 
    }
}
