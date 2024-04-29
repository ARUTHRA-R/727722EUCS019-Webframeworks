package com.example.ques1.AruthraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruEmployee;
import com.example.ques1.AruthraRepository.AruEmployeeRepo;



@Service
public class AruEmployeeService {
    @Autowired
    AruEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AruEmployee setEmployee(AruEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AruEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AruEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
