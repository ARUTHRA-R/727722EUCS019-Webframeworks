package com.examly.class_exercise_1.Aruthracontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.Aruthramodel.AruthraPerson;
import com.examly.class_exercise_1.Aruthraservice.AruthraPersonService;

@RestController
public class AruthraPersonController {

     @Autowired
     public AruthraPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AruthraPerson> postMethodName(@RequestBody AruthraPerson entity) {

          AruthraPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<AruthraPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AruthraPerson>> getMethodName() {

          List<AruthraPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AruthraPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AruthraPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AruthraPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}