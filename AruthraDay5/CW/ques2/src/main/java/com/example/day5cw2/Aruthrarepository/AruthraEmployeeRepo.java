package com.example.day5cw2.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.Aruthramodel.AruthraEmployee;


@Repository
public interface AruthraEmployeeRepo extends JpaRepository<AruthraEmployee,Integer>{
    
}
