package com.example.ques2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques2.Model.Device;

public interface DeviceRepo extends JpaRepository<Device, Integer> {
    List<Device> findByUserId(int userId);
}
