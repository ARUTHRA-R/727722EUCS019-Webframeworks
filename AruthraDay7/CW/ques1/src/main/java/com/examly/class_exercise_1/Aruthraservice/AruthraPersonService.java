package com.examly.class_exercise_1.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.Aruthramodel.AruthraPerson;
import com.examly.class_exercise_1.Aruthrarepository.AruthraPersonRepo;

@Service
public class AruthraPersonService {

     @Autowired
     public AruthraPersonRepo personRepo;

     public AruthraPerson SaveEntity(AruthraPerson entity) {
          return personRepo.save(entity);

     }

     public List<AruthraPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AruthraPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
