package com.example.day5cw2.Aruthracontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw2.Aruthramodel.AruthraEmployee;
import com.example.day5cw2.Aruthraservice.AruthraEmployeeService;

@RestController
public class AruthraEmployeeController {
    public AruthraEmployeeService employeeService;
    public AruthraEmployeeController( AruthraEmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<AruthraEmployee> postMethodName(@RequestBody AruthraEmployee employee) {
        if(employeeService.saveEmployee(employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<AruthraEmployee> putMethodName(@PathVariable("employeeId") int id, @RequestBody AruthraEmployee employee) {
        if(employeeService.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<AruthraEmployee> delete(@PathVariable("employeeId") int id,@RequestBody AruthraEmployee employee)
    {
        if(employeeService.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
