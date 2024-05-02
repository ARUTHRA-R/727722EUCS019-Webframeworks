package com.example.ques2.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques2.Model.Device;
import com.example.ques2.Model.User;
import com.example.ques2.Repository.DeviceRepo;
import com.example.ques2.Repository.UserRepo;



@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private DeviceRepo deviceRepo;

    // User Endpoints

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userRepo.save(user), HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        return ResponseEntity.ok(userRepo.findById(id).orElse(null));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepo.findAll());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        Optional<User> existingUser = userRepo.findById(id);

        if (!existingUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        User updatedUser = existingUser.get();
        updatedUser.setName(user.getName());
        updatedUser.setEmail(user.getEmail());
        userRepo.save(updatedUser);

        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Device Endpoints

    @PostMapping("/devices")
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        return new ResponseEntity<>(deviceRepo.save(device), HttpStatus.CREATED);
    }

    @GetMapping("/devices/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable int id) {
        return ResponseEntity.ok(deviceRepo.findById(id).orElse(null));
    }

    @GetMapping("/devices")
    public ResponseEntity<List<Device>> getAllDevices() {
        return ResponseEntity.ok(deviceRepo.findAll());
    }

    @PutMapping("/devices/{id}")
    public ResponseEntity<Device> updateDevice(@PathVariable int id, @RequestBody Device device) {
        Optional<Device> existingDevice = deviceRepo.findById(id);

        if (!existingDevice.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Device updatedDevice = existingDevice.get();
        updatedDevice.setName(device.getName());
        updatedDevice.setStatus(device.isStatus());
        updatedDevice.setSettings(device.getSettings());
        deviceRepo.save(updatedDevice);

        return ResponseEntity.ok(updatedDevice);
    }

    @DeleteMapping("/devices/{id}")
    public ResponseEntity<Void> deleteDevice(@PathVariable int id) {
        deviceRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/devices/{id}/toggle")
    public ResponseEntity<Device> toggleDeviceStatus(@PathVariable int id) {
        Optional<Device> existingDevice = deviceRepo.findById(id);

        if (!existingDevice.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Device updatedDevice = existingDevice.get();
        updatedDevice.setStatus(!updatedDevice.isStatus());
        deviceRepo.save(updatedDevice);

        return ResponseEntity.ok(updatedDevice);
    }

    @PutMapping("/devices/{id}/settings")
    public ResponseEntity<Device> updateDeviceSettings(@PathVariable int id,
            @RequestBody Map<String, String> settings) {
        Optional<Device> existingDevice = deviceRepo.findById(id);

        if (!existingDevice.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Device updatedDevice = existingDevice.get();
        updatedDevice.setSettings(settings);
        deviceRepo.save(updatedDevice);

        return ResponseEntity.ok(updatedDevice);
    }

    @GetMapping("/devices/user/{userId}")
    public ResponseEntity<List<Device>> getDevicesByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(deviceRepo.findByUserId(userId));
    }

}
