package com.example.bidirection.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Aruthramodel.AruthraStudentInfo;

@Repository
public interface AruthraStudentInfoRepository extends JpaRepository<AruthraStudentInfo,Integer>{
    
}