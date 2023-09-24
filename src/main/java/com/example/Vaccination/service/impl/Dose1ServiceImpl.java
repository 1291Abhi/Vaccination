package com.example.Vaccination.service.impl;

import com.example.Vaccination.Enum.VaccineType;
import com.example.Vaccination.model.Dose1;
import com.example.Vaccination.model.User;
import com.example.Vaccination.service.Dose1Service;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class Dose1ServiceImpl implements Dose1Service {
    @Override
    public Dose1 createDose1(User user, VaccineType vaccineType) {
        Dose1 dose1=Dose1.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .vaccineType(vaccineType)
                .user(user)
                .build();
        return dose1;
    }
}
