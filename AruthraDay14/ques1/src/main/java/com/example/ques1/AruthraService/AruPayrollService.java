package com.example.ques1.AruthraService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruPayroll;
import com.example.ques1.AruthraRepository.AruPayrollRepo;


@Service
public class AruPayrollService {
    @Autowired
    AruPayrollRepo payrollRepo;

    public AruPayroll addPayroll(Long id,AruPayroll payroll)
    {
        AruPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<AruPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}

