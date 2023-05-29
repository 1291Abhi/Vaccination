package com.example.Vaccination.service;

import com.example.Vaccination.DTO.RequestDTO.DoctorRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.DoctorResponseDTO;
import com.example.Vaccination.exception.CenterNotPresentException;

public interface DoctorService {
    public DoctorResponseDTO addDoctor(DoctorRequestDTO doctorRequestDTO) throws CenterNotPresentException;
}
