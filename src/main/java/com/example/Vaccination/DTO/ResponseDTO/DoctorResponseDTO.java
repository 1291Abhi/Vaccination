package com.example.Vaccination.DTO.ResponseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorResponseDTO {
    String name;
    String emailId;
    String mobNo;
    CenterResponseDTO centerResponseDTO;
}
