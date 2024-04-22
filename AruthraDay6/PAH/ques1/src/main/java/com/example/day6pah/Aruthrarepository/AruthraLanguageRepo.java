package com.example.day6pah.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.Aruthramodel.AruthraLanguage;

@Repository
public interface AruthraLanguageRepo extends JpaRepository<AruthraLanguage,Integer>{
    
}
