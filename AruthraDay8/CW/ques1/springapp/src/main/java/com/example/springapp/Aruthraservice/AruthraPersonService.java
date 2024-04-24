package com.example.springapp.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aruthramodel.AruthraPerson;
import com.example.springapp.Aruthrarepository.AruthraPersonRepo;

@Service
public class AruthraPersonService {
    @Autowired
    private AruthraPersonRepo rep;

    public boolean post(AruthraPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AruthraPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AruthraPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
