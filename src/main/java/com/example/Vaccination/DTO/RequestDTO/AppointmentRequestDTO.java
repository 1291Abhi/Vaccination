package com.example.Vaccination.DTO.RequestDTO;

import com.example.Vaccination.Enum.DoseNo;
import com.example.Vaccination.Enum.VaccineType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentRequestDTO {
    DoseNo doseNo;
    int userId;
    int doctorId;
    VaccineType vaccineType;
}
