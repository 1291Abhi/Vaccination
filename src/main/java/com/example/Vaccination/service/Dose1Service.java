package com.example.Vaccination.service;

import com.example.Vaccination.Enum.VaccineType;
import com.example.Vaccination.model.Dose1;
import com.example.Vaccination.model.User;

public interface Dose1Service {
    public Dose1 createDose1(User user, VaccineType vaccineType);
}
