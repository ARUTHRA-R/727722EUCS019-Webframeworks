package com.example.relation.Aruthraservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.Aruthramodel.AruthraStudent;
import com.example.relation.Aruthrarepository.AruthraStudentRepository;

@Service
public class AruthraStudentService {
    public AruthraStudentRepository studentRepository;
    public AruthraStudentService(AruthraStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AruthraStudent saveStudent(AruthraStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AruthraStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
