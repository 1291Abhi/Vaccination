package com.example.Vaccination.model;

import com.example.Vaccination.Enum.CenterType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name="vaccination_center")
public class VaccinationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;
    @Column(name="location")
    String location;
    @Column(name="center_type")
            @Enumerated(EnumType.STRING)
    CenterType centerType;

    @OneToMany(mappedBy = "vaccinationCenter",cascade = CascadeType.ALL)
    List<Doctor> doctorList=new ArrayList<>();


}
