package com.example.ques1.AruthraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ques1.AruthraModel.AruBook;


@Repository
public interface AruBookRepo extends JpaRepository<AruBook, Long> {
}

