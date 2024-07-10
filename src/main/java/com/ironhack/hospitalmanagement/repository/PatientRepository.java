package com.ironhack.hospitalmanagement.repository;

import com.ironhack.hospitalmanagement.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);
    List<Patient> findByAdmittedBy_Department(String department);
    List<Patient> findByAdmittedBy_Status(String status);
}
