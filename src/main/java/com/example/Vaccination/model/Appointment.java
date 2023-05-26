package com.example.Vaccination.model;

import com.example.Vaccination.Enum.DoseNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="appointment_No")
    String appointmentNo;
    @Column(name="date_of_appointment")
            @CreationTimestamp
    Date dateOfAppointment;
    @Column(name="dose_no")
            @Enumerated(EnumType.STRING)
    DoseNo doseNo;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Doctor doctor;


}
