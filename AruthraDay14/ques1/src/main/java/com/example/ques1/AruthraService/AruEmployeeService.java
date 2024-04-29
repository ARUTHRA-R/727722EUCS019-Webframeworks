package com.example.ques1.AruthraService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruEmployee;
import com.example.ques1.AruthraRepository.AruEmployeeRepo;


@Service

public class AruEmployeeService {
    @Autowired
    AruEmployeeRepo employeeRepo;

    public AruEmployee addEmployee(AruEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AruEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<AruEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}

