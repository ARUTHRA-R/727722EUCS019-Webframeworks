package com.example.ques2.AruthraRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ques2.AruthraModel.AruStudent;


@Repository
public interface AruStudentRepo extends JpaRepository<AruStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AruStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AruStudent> getStudentsLeftOuter();

    

    
}

