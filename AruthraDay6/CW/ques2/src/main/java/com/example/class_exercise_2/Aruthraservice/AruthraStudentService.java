package com.example.class_exercise_2.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.Aruthramodel.AruthraStudent;
import com.example.class_exercise_2.Aruthrarepository.AruthraStudentRepo;

@Service
public class AruthraStudentService {

     @Autowired
     public AruthraStudentRepo studentRepo;

     public List<AruthraStudent> getAll() {
          return studentRepo.findAll();
     }

     public AruthraStudent post(AruthraStudent student) {
          return studentRepo.save(student);
     }

     public List<AruthraStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
