package com.example.class_exercise_1.Aruthraservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Aruthramodel.AruthraChildren;
import com.example.class_exercise_1.Aruthrarepository.AruthraChildrenRepo;

@Service
public class AruthraChildrenService {

     @Autowired
     public AruthraChildrenRepo childrenRepo;

     public List<AruthraChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AruthraChildren save(AruthraChildren children) {
          return childrenRepo.save(children);

     }

     public List<AruthraChildren> sortedPage(int offset, int pagesize, String field) {
          Page<AruthraChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AruthraChildren> pagination(int offset, int pagesize) {
          Page<AruthraChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
