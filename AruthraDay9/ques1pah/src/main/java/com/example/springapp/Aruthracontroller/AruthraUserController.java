package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.AruthraUser;
import com.example.springapp.service.AruthraUserService;

@RestController
@RequestMapping("/api")
public class AruthraUserController {
    
    @Autowired
    private AruthraUserService userService;

    @PostMapping("/user")
    public ResponseEntity<AruthraUser> post(@RequestBody AruthraUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<AruthraUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<AruthraUser> getById(@PathVariable int userId)
    {
        AruthraUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AruthraUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<AruthraUser> getByUserName(@PathVariable String userName)
    {
        AruthraUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AruthraUser>(user, HttpStatus.OK);
        }
    }
}
