package com.example.relation.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Aruthramodel.AruthraStudent;

@Repository
public interface AruthraStudentRepository extends JpaRepository<AruthraStudent,Integer>{
    
}
