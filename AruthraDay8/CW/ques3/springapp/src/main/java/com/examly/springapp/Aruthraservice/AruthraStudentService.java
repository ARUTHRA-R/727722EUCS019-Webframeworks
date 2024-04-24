package com.examly.springapp.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Aruthramodel.AruthraStudent;
import com.examly.springapp.Aruthrarepository.AruthraStudentRepo;

@Service
public class AruthraStudentService {
    @Autowired
    private AruthraStudentRepo studentRepo;

    public boolean post(AruthraStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AruthraStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AruthraStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
