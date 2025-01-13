package com.example.PatientManagementSystem.repository;

import com.example.PatientManagementSystem.dto.PatientDTO;
import com.example.PatientManagementSystem.entity.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PatientRepository {

    private EntityManager entityManager;

    public PatientDTO findById(Long id) {
        String query = "SELECT new com.example.patientmanagement.dto.PatientDTO(p.id, p.firstName, p.lastName, p.age) " +
                "FROM Patient p WHERE p.id = :id";
        TypedQuery<PatientDTO> typedQuery = entityManager.createQuery(query, PatientDTO.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getResultStream().findFirst().orElse(null);
    }

    public List<PatientDTO> findByFirstName(String firstname){
        String query = "SELECT new om.example.PatientManagementSystem.dto.PatientDTO)(p.id, p.firstName, p.Lastname, p.age)" + "FROM patient p WHERE p.firstName = :firstName";
        TypedQuery<PatientDTO> typedQuery = entityManager.createQuery(query, PatientDTO.class);
        typedQuery.setParameter("firstName", firstname);
        return typedQuery.getResultList();
    }
    public List<PatientDTO> findByLastName(String lastName){
        String query = "SELECT new com.example.PatientManagementSystem.dto.PatientDTO(p.id, p.firstName, p.lastName, p.age)" + "FROM Patient p WHERE p.lastName = :lastName";
        TypedQuery<PatientDTO> typedQuery = entityManager.createQuery(query, PatientDTO.class);
        typedQuery.setParameter("lastName", lastName);
        return typedQuery.getResultList();
    }
    public List<PatientDTO> findByAge(int age){
        String query = "SELECT new com.example.PatientManagementSystem.dto.PatientDTO(p.id , p.firstName, p.lastName, p.age)" + "FROM Patient p WHERE p.age = :age";
        TypedQuery<PatientDTO> typedQuery = entityManager.createQuery(query, PatientDTO.class);
        typedQuery.setParameter("age", age);
        return typedQuery.getResultList();
    }
}
