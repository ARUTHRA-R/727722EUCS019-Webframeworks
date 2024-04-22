package com.example.day5cw1.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.Aruthramodel.AruthraProduct;

@Repository
public interface AruthraProductRepo extends JpaRepository<AruthraProduct,Integer>{
    
}
