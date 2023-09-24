package com.example.Vaccination.DTO.ResponseDTO;

import com.example.Vaccination.Enum.DoseNo;
import com.example.Vaccination.Enum.VaccineType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentResponseDTO {
    String userName;
    String appointmentNo;
    Date dateOfAppointment;
    DoseNo doseNo;
//    CenterResponseDTO centerResponseDTO;
    String doctorName;
    VaccineType vaccineType;
}
