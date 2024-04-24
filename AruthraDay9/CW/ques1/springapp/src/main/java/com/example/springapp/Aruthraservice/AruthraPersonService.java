package com.example.springapp.Aruthraservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Aruthramodel.AruthraPerson;
import com.example.springapp.Aruthrarepository.AruthraPersonRepo;

@Service
public class AruthraPersonService {
    public AruthraPersonRepo personRepo;

    public AruthraPersonService(AruthraPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AruthraPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AruthraPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
