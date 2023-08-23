package com.example.Vaccination.service;

import com.example.Vaccination.DTO.RequestDTO.AppointmentRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.AppointmentResponseDTO;
import com.example.Vaccination.exception.DoctorNotFoundException;
import com.example.Vaccination.exception.UserNotFoundException;

public interface AppointmentService {
    public AppointmentResponseDTO bookAppointment(AppointmentRequestDTO appointmentRequestDTO) throws UserNotFoundException, DoctorNotFoundException;
}
