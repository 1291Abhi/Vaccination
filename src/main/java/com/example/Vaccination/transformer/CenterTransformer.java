package com.example.Vaccination.transformer;

import com.example.Vaccination.DTO.RequestDTO.CenterRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.CenterResponseDTO;
import com.example.Vaccination.model.VaccinationCenter;

public class CenterTransformer {
    public static VaccinationCenter CenterRequestDTOToCenter(CenterRequestDTO centerRequestDTO){
        return VaccinationCenter.builder()
                .name(centerRequestDTO.getName())
                .location(centerRequestDTO.getLocation())
                .centerType(centerRequestDTO.getCenterType()).build();
    }

    public static CenterResponseDTO CenterToCenterResponseDTO(VaccinationCenter center) {
        return CenterResponseDTO.builder()
                .name(center.getName())
                .location(center.getLocation())
                .centerType(center.getCenterType()).build();
    }
}
