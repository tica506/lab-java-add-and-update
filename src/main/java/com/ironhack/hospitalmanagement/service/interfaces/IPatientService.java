package com.ironhack.hospitalmanagement.service.interfaces;

import com.ironhack.hospitalmanagement.model.Patient;

import java.time.LocalDate;
import java.util.List;

public interface IPatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    List<Patient> getPatientsByDateOfBirthRange(LocalDate startDate, LocalDate endDate);
    List<Patient> getPatientsByAdmittingDoctorDepartment(String department);
    List<Patient> getPatientsByAdmittingDoctorStatusOff(String off);
}
