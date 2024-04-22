package com.example.day5cw2.Aruthraservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.Aruthramodel.AruthraEmployee;
import com.example.day5cw2.Aruthrarepository.AruthraEmployeeRepo;

@Service
public class AruthraEmployeeService {
    public AruthraEmployeeRepo employeeRepo;
    public AruthraEmployeeService(AruthraEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AruthraEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AruthraEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AruthraEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
