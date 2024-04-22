package com.example.class_exercise_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.AruthraMedicine;
import com.example.class_exercise_1.repository.AruthraMedicineRepository;

@Service
public class MedicineService {

     @Autowired
     AruthraMedicineRepository medicineRepository;

     public List<AruthraMedicine> getAllMedicines() {
          // List<Medicine> list ;
          return medicineRepository.findAll();
     }

     public AruthraMedicine addMedicine(AruthraMedicine medicine) {
          return medicineRepository.save(medicine);
     }

     public Optional<AruthraMedicine> getRequiredMedicin(int medicineId) {
          return medicineRepository.findById(medicineId);
     }

}
