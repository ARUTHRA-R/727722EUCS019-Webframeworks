package com.example.springapp.Aruthrarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Aruthramodel.AruthraPerson;

public interface AruthraPersonRepo extends JpaRepository<AruthraPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AruthraPerson> findByAge(int age);
}
