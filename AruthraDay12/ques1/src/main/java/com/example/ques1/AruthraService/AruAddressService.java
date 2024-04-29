package com.example.ques1.AruthraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruAddress;
import com.example.ques1.AruthraRepository.AruAddressRepo;
import com.example.ques1.AruthraRepository.AruEmployeeRepo;



@Service
public class AruAddressService {
    @Autowired
    AruAddressRepo addressRepo;
    @Autowired
    AruEmployeeRepo employeeRepo;
    public AruAddress setAddressById(int id,AruAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
