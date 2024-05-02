package com.example.ques2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques2.Model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
