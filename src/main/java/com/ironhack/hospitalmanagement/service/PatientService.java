package com.ironhack.hospitalmanagement.service;

import com.ironhack.hospitalmanagement.model.Patient;
import com.ironhack.hospitalmanagement.repository.PatientRepository;
import com.ironhack.hospitalmanagement.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> patientOptional = patientRepository.findById(id);
        return patientOptional.orElse(null);
    }

    @Override
    public List<Patient> getPatientsByDateOfBirthRange(LocalDate startDate, LocalDate endDate) {
        return patientRepository.findByDateOfBirthBetween(startDate, endDate);
    }

    @Override
    public List<Patient> getPatientsByAdmittingDoctorDepartment(String department) {
        return patientRepository.findByAdmittedBy_Department(department);
    }

    @Override
    public List<Patient> getPatientsByAdmittingDoctorStatusOff(String off) {
        return patientRepository.findByAdmittedBy_Status(off);
    }
}
