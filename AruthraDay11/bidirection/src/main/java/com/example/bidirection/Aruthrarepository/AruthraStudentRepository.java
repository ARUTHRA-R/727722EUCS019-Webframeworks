package com.example.bidirection.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Aruthramodel.AruthraStudent;



@Repository
public interface AruthraStudentRepository extends JpaRepository<AruthraStudent,Integer>{
    
}
