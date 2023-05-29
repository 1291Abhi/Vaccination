package com.example.Vaccination.transformer;

import com.example.Vaccination.DTO.RequestDTO.DoctorRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.CenterResponseDTO;
import com.example.Vaccination.DTO.ResponseDTO.DoctorResponseDTO;
import com.example.Vaccination.model.Doctor;
import com.example.Vaccination.model.VaccinationCenter;

public class DoctorTransformer {
    public static Doctor doctorRequestDTOToCenter(DoctorRequestDTO doctorRequestDTO){
        return Doctor.builder()
                .name(doctorRequestDTO.getName())
                .age(doctorRequestDTO.getAge())
                .emailId(doctorRequestDTO.getEmailId())
                .contactNo(doctorRequestDTO.getContactNo())
                .gender(doctorRequestDTO.getGender())
                .build();
    }
    public static DoctorResponseDTO centerTODoctorResponseDTO(Doctor doctor, CenterResponseDTO centerResponseDTO){
        return DoctorResponseDTO.builder()
                .name(doctor.getName())
                .mobNo(doctor.getContactNo())
                .emailId(doctor.getEmailId())
                .centerResponseDTO(centerResponseDTO).build();
    }
}
