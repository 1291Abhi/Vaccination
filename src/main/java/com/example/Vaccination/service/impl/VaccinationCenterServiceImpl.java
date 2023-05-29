package com.example.Vaccination.service.impl;

import com.example.Vaccination.DTO.RequestDTO.CenterRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.CenterResponseDTO;
import com.example.Vaccination.model.VaccinationCenter;
import com.example.Vaccination.repository.CenterRepository;
import com.example.Vaccination.service.VaccinationCenterService;
import com.example.Vaccination.transformer.CenterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService {

    @Autowired
    CenterRepository centerRepository;
    @Override
    public CenterResponseDTO addCenter(CenterRequestDTO centerRequestDTO) {
        // dto-entity
        VaccinationCenter center= CenterTransformer.CenterRequestDTOToCenter(centerRequestDTO);

        //add to db

        VaccinationCenter saveCenter= centerRepository.save(center);
        return CenterTransformer.CenterToCenterResponseDTO(saveCenter);
    }
}
