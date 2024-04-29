package com.example.ques2.AruthraService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques2.AruthraModel.AruStudentdetail;
import com.example.ques2.AruthraRepository.AruStudentDetailRepo;
import com.example.ques2.AruthraRepository.AruStudentRepo;




@Service
public class AruStudentDetailService {
    @Autowired
    AruStudentDetailRepo studentDetailRepository;
    @Autowired
    AruStudentRepo studentRepository;
    public AruStudentdetail addStudentDetail(int id,AruStudentdetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}

