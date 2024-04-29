package com.example.ques1.AruthraController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques1.AruthraModel.AruPayroll;
import com.example.ques1.AruthraService.AruPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AruPayrollController {
    @Autowired
    AruPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public AruPayroll addPayroll(@PathVariable Long employeeId,@RequestBody AruPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<AruPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}

