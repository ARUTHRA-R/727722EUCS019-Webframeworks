package com.example.day6cw3.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.Aruthramodel.AruthraProduct;

@Repository
public interface AruthraProductRepo extends JpaRepository<AruthraProduct,Integer>{
    
}
