package com.example.class_exercise_2.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.Aruthramodel.AruthraStudent;

@Repository
public interface AruthraStudentRepo extends JpaRepository<AruthraStudent, Integer> {

}