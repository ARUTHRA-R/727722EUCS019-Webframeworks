
package com.example.ques2.AruthraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques2.AruthraModel.AruStudent;
import com.example.ques2.AruthraRepository.AruStudentRepo;


@Service
public class AruStudentService {
    @Autowired
    AruStudentRepo studentRepository;
    public AruStudent addStudents(AruStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AruStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AruStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AruStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
