package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientRequestDTO;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.model.Patient;

import java.util.List;
import java.util.UUID;

public interface PatientService {

    public List<PatientResponseDTO> getPatients();

    public PatientResponseDTO addPatient(PatientRequestDTO patientRequestDTO);

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);
}
