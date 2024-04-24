package com.examly.springapp.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Aruthramodel.AruthraDoor;
import com.examly.springapp.Aruthrarepository.AruthraDoorRepo;

@Service
public class AruthraDoorService {
    @Autowired
    private AruthraDoorRepo doorRepo;

    public AruthraDoor postData(AruthraDoor door) {
        return doorRepo.save(door);
    }

    public List<AruthraDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AruthraDoor updateDetail(int doorid, AruthraDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AruthraDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AruthraDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AruthraDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}