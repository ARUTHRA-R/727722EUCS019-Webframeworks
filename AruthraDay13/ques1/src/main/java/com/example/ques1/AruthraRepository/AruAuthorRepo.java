package com.example.ques1.AruthraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ques1.AruthraModel.AruAuthor;
@Repository
public interface AruAuthorRepo extends JpaRepository<AruAuthor, Long> {
}
