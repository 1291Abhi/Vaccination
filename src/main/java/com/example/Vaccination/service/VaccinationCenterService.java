package com.example.Vaccination.service;

import com.example.Vaccination.DTO.RequestDTO.CenterRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.CenterResponseDTO;

public interface VaccinationCenterService {
    public CenterResponseDTO addCenter(CenterRequestDTO centerRequestDTO);
}
