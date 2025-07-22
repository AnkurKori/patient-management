package com.pm.patient_service.exception;

public class PatientNotFoundExcpetion extends RuntimeException {
    public PatientNotFoundExcpetion(String message) {
        super(message);
    }
}
