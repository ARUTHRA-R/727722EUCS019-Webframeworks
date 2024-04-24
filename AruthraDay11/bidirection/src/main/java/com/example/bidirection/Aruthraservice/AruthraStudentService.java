package com.example.bidirection.Aruthraservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.Aruthramodel.AruthraStudent;
import com.example.bidirection.Aruthramodel.AruthraStudentInfo;
import com.example.bidirection.Aruthrarepository.AruthraStudentInfoRepository;
import com.example.bidirection.Aruthrarepository.AruthraStudentRepository;

@Service
public class AruthraStudentService {
    public AruthraStudentRepository studentRepository;
    public AruthraStudentInfoRepository studentInfoRepository;
    public AruthraStudentService(AruthraStudentRepository studentRepository,AruthraStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AruthraStudent saveStudent(AruthraStudent student)
    {
        return studentRepository.save(student);
    }
    public AruthraStudentInfo saveStudentInfo(AruthraStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AruthraStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
