package com.example.Vaccination.DTO.RequestDTO;

import com.example.Vaccination.Enum.CenterType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CenterRequestDTO {
    String name;

    String location;

    CenterType centerType;
}
