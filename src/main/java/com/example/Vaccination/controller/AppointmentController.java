package com.example.Vaccination.controller;

import com.example.Vaccination.DTO.RequestDTO.AppointmentRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.AppointmentResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @PostMapping("/add")
    public AppointmentResponseDTO addAppointment(@RequestBody AppointmentRequestDTO appointmentRequestDTO){

    }
}
