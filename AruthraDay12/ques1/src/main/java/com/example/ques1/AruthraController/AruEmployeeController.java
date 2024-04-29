package com.example.ques1.AruthraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques1.AruthraModel.AruEmployee;
import com.example.ques1.AruthraService.AruEmployeeService;



@RestController
public class AruEmployeeController {
    @Autowired
    AruEmployeeService employeeService;

    @PostMapping("/employee")
    public AruEmployee setMethod(@RequestBody AruEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AruEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AruEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}

