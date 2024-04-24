package com.example.relation.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Aruthramodel.AruthraStudentInfo;

@Repository
public interface AruthraStudentInfoRepository extends JpaRepository<AruthraStudentInfo,Integer>{
    
}