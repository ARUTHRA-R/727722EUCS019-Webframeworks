package com.example.springapp.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aruthramodel.AruthraPerson;

import java.util.List;


@Repository
public interface AruthraPersonRepo extends JpaRepository<AruthraPerson,Integer>{

    List<AruthraPerson> findByNameStartingWith(String name);
    List<AruthraPerson> findByNameEndingWith(String name);
    
}
