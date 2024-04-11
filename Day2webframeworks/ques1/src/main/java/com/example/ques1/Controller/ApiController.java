package com.example.ques1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques1.Config.AppConfig;

@RestController
public class ApiController {
    private final AppConfig u;
    @Autowired
    public ApiController(AppConfig u){
        this.u = u;    
    }
    @GetMapping("/atvalue")
    public String atValue(){
        return "Name: "+u.getAppname()+ "Version: "+u.getAppversion();
    }

}
