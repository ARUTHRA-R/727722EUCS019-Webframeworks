package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.AruthraJob;
import com.example.class_exercise_2.service.AruthraJobService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class AruthraJobController {

     @Autowired
     public AruthraJobService jobService;

     @GetMapping("/api/job")
     public ResponseEntity<List<AruthraJob>> displayDetails() {
          List<AruthraJob> list = jobService.getList();
          if (list.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          } else {

               return new ResponseEntity<>(list, HttpStatus.OK);
          }

     }

     @PostMapping("/api/job")
     public AruthraJob postMethodName(@RequestBody AruthraJob job) {
          return jobService.postJob(job);
     }

     @GetMapping("/api/job/{jobId}")
     public ResponseEntity<Optional<AruthraJob>> getMethodName(@PathVariable int jobId) {

          Optional<AruthraJob> Id = jobService.getId(jobId);
          if (Id.isPresent()) {
               return new ResponseEntity<>(Id, HttpStatus.OK);
          }
          return new ResponseEntity<Optional<AruthraJob>>(Id, HttpStatus.NOT_FOUND);

     }

}