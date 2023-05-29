package com.example.Vaccination.controller;

import com.example.Vaccination.DTO.RequestDTO.CenterRequestDTO;
import com.example.Vaccination.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {
    @Autowired
    VaccinationCenterService centerService;
    @PostMapping("/addCenter")
    public ResponseEntity addVaccinationCenter(@RequestBody CenterRequestDTO centerRequestDTO){
        return new ResponseEntity(centerService.addCenter(centerRequestDTO), HttpStatus.CREATED);
    }
}
