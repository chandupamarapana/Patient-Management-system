package com.example.PatientManagementSystem.controller;

import com.example.PatientManagementSystem.dto.PatientDTO;
import com.example.PatientManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/{id}")
    public PatientDTO getPatientById(Long id){
        return patientService.getPatientById(id);
    }
    @GetMapping("/firstname/{firstName}")
    public List<PatientDTO> getPatientsByFirstName(@PathVariable String firstName) {
        return patientService.getPatientsByFirstName(firstName);
    }
    @GetMapping("/lastname/{lastName}")
    public List<PatientDTO> getPatientsByLastName(@PathVariable String lastName) {
        return patientService.getPatientByLastName(lastName);
    }

    @GetMapping("/age/{age}")
    public List<PatientDTO> getPatientsByAge(@PathVariable int age) {
        return patientService.getPatientByAge(age);
    }
}
