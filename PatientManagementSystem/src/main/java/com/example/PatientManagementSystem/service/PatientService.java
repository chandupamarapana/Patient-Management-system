package com.example.PatientManagementSystem.service;

import com.example.PatientManagementSystem.dto.PatientDTO;
import com.example.PatientManagementSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public PatientDTO getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    public List<PatientDTO> getPatientsByFirstName(String firstName) {
        return patientRepository.findByFirstName(firstName);
    }
    public List<PatientDTO> getPatientByLastName(String lastName){
        return patientRepository.findByLastName(lastName);
    }
    public List<PatientDTO> getPatientByAge(int age){
        return patientRepository.findByAge(age);
    }
}
