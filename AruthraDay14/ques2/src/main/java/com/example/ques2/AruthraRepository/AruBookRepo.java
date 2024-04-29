package com.example.ques2.AruthraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.ques2.AruthraModel.AruBook;

@Repository
public interface AruBookRepo extends JpaRepository<AruBook,Integer> {
    
}

