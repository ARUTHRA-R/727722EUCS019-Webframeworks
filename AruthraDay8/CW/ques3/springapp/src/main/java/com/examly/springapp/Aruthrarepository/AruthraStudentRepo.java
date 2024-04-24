package com.examly.springapp.Aruthrarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Aruthramodel.AruthraStudent;

import java.util.List;

@Repository
public interface AruthraStudentRepo extends JpaRepository<AruthraStudent, Long> {

    List<AruthraStudent> findByMarksGreaterThan(int mark);

    List<AruthraStudent> findByMarksLessThan(int mark);

}
