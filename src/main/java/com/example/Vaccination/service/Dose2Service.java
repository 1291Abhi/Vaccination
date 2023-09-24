package com.example.Vaccination.service;

import com.example.Vaccination.Enum.VaccineType;
import com.example.Vaccination.exception.Dose1NotTakenException;
import com.example.Vaccination.exception.Dose1VaccineNotMatchWithCurrentVaccineTypeException;
import com.example.Vaccination.model.Dose1;
import com.example.Vaccination.model.Dose2;
import com.example.Vaccination.model.User;

public interface Dose2Service {
    public Dose2 createDose2(User user, VaccineType vaccineType) throws Dose1NotTakenException, Dose1VaccineNotMatchWithCurrentVaccineTypeException;
}
