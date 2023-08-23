package com.example.Vaccination.model;

import com.example.Vaccination.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Table(name = "dose1")
@Builder
public class Dose1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "dose_id")
    String doseId;

    @Column(name="vaccine_type")
            @Enumerated(EnumType.STRING)
    VaccineType vaccineType;

    @Column(name = "vaccine_date")
            @CreationTimestamp
    Date vaccineDate;

    @OneToOne
    @JoinColumn
    User user;
}
