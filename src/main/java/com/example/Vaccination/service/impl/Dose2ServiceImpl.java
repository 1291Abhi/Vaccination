package com.example.Vaccination.service.impl;

import com.example.Vaccination.Enum.VaccineType;
import com.example.Vaccination.exception.Dose1NotTakenException;
import com.example.Vaccination.exception.Dose1VaccineNotMatchWithCurrentVaccineTypeException;
import com.example.Vaccination.model.Dose1;
import com.example.Vaccination.model.Dose2;
import com.example.Vaccination.model.User;
import com.example.Vaccination.service.Dose2Service;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class Dose2ServiceImpl implements Dose2Service {

    @Override
    public Dose2 createDose2(User user, VaccineType vaccineType) throws Dose1NotTakenException, Dose1VaccineNotMatchWithCurrentVaccineTypeException {
        if(user.isDose1Taken()==false){
            throw new Dose1NotTakenException("Dose1 should be taken before booking for dose2");
        }
        if(user.getDose1().getVaccineType()!=vaccineType){
            throw new Dose1VaccineNotMatchWithCurrentVaccineTypeException("Dose2 vaccine type should be matched with dose1");
        }
        Dose2 dose2=Dose2.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .vaccineType(vaccineType)
                .user(user)
                .build();
        return dose2;
    }
}
