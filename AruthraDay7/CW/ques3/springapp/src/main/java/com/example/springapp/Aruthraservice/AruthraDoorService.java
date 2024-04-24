package com.example.springapp.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aruthramodel.AruthraDoor;
import com.example.springapp.Aruthrarepository.AruthraDoorRepo;

@Service
public class AruthraDoorService {
    @Autowired
    private AruthraDoorRepo rep;

    public boolean post(AruthraDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AruthraDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AruthraDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AruthraDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
