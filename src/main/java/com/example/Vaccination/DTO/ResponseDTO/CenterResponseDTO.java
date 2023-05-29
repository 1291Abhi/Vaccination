package com.example.Vaccination.DTO.ResponseDTO;

import com.example.Vaccination.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CenterResponseDTO {
    String name;

    String location;

    CenterType centerType;
}
