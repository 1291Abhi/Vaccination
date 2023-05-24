package com.example.Vaccination.model;

import com.example.Vaccination.Enum.Gender;
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
@Table(name = "doctor")
public class Doctor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name="age")
    int age;

    @Column(name="email_id",unique = true,nullable = false)
    String emailId;

    @Column(name="contact_no",unique = true,nullable = false,length = 10)
    String contactNo;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    List<Appointment> appointmentList=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    VaccinationCenter vaccinationCenter;

}
