package com.example.springapp.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aruthramodel.AruthraDoor;

import java.util.List;

@Repository
public interface AruthraDoorRepo extends JpaRepository<AruthraDoor,Integer>{

    List<AruthraDoor> findByDoorId(int doorId);
    List<AruthraDoor> findByAccessType(String accessType);
    
}
