package com.examly.class_exercise_1.Aruthrarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.Aruthramodel.AruthraPerson;

/**
 * PersonRepo
 */
@Repository
public interface AruthraPersonRepo extends JpaRepository<AruthraPerson, Integer> {

     List<AruthraPerson> findByAge(int byAge);
}