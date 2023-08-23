package com.example.Vaccination.service.impl;

import com.example.Vaccination.DTO.RequestDTO.AppointmentRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.AppointmentResponseDTO;
import com.example.Vaccination.Enum.DoseNo;
import com.example.Vaccination.exception.DoctorNotFoundException;
import com.example.Vaccination.exception.UserNotFoundException;
import com.example.Vaccination.model.Doctor;
import com.example.Vaccination.model.Dose1;
import com.example.Vaccination.model.User;
import com.example.Vaccination.repository.CenterRepository;
import com.example.Vaccination.repository.DoctorRepository;
import com.example.Vaccination.repository.UserRepository;
import com.example.Vaccination.service.AppointmentService;
import com.example.Vaccination.service.Dose1Service;
import com.example.Vaccination.service.Dose2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CenterRepository centerRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    Dose1Service dose1Service;

    @Autowired
    Dose2Service dose2Service;

    @Override
    public AppointmentResponseDTO bookAppointment(AppointmentRequestDTO appointmentRequestDTO) throws UserNotFoundException, DoctorNotFoundException {
        Optional<User> userOptional=userRepository.findById(appointmentRequestDTO.getUserId());
        if(!userOptional.isPresent()){
            throw new UserNotFoundException("User doesn't Exists");
        }
        Optional<Doctor> doctorOptional=doctorRepository.findById(appointmentRequestDTO.getDoctorId());
        if(!doctorOptional.isPresent()){
            throw new DoctorNotFoundException("Doctor doesn't Exists");
        }

        User user=userOptional.get();
        Doctor doctor=doctorOptional.get();

        if(appointmentRequestDTO.getDoseNo()== DoseNo.DOSE_1){
            Dose1 dose1=dose1Service.createDose1(user,appointmentRequestDTO.getVaccineType());
            user.setDose1Taken(true);
            user.setDose1(dose1);
        }
        else{
            //do later
        }
    }
}
