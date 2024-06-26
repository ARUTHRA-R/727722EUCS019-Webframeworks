package com.priyanshu.q_04.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshu.q_04.model.AruthraPatient;
import com.priyanshu.q_04.service.AruthraPatientService;

@RestController
@RequestMapping("api")
public class AruthraPatientController {

    @Autowired
    private AruthraPatientService patientService;

    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public AruthraPatient getAllPatient(@RequestBody AruthraPatient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<AruthraPatient>> getAllPatients() {
        List<AruthraPatient> list = patientService.getAllPatients();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<AruthraPatient>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<AruthraPatient> getPatientById(@PathVariable int patientId) {
        Optional<AruthraPatient> patient = patientService.getPatientById(patientId);

        if (patient.isPresent()) {
            return new ResponseEntity<>(patient.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}