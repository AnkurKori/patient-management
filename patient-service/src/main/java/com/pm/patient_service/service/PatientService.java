package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;



    public List<PatientResponseDTO> getPatients()
    {
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientsDTO = patients.stream().map(patient-> PatientMapper.toDTO(patient)).collect(Collectors.toList());
        return patientsDTO;
    }
}
