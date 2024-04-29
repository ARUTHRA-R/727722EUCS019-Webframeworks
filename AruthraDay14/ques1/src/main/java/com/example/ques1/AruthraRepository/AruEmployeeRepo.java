package com.example.ques1.AruthraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ques1.AruthraModel.AruEmployee;


@Repository
public interface AruEmployeeRepo extends JpaRepository<AruEmployee,Long> {
    
}

