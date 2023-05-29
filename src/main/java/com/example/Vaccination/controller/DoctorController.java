package com.example.Vaccination.controller;

import com.example.Vaccination.DTO.RequestDTO.DoctorRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.DoctorResponseDTO;
import com.example.Vaccination.exception.CenterNotPresentException;
import com.example.Vaccination.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/add")
    public ResponseEntity addDoctor(@RequestBody DoctorRequestDTO doctorRequestDTO){
        try{
            DoctorResponseDTO doctorResponseDTO=doctorService.addDoctor(doctorRequestDTO);
            return new ResponseEntity(doctorResponseDTO,HttpStatus.CREATED);
        } catch (CenterNotPresentException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

}
