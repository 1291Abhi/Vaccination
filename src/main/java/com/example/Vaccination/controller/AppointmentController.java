package com.example.Vaccination.controller;


import com.example.Vaccination.DTO.RequestDTO.AppointmentRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.AppointmentResponseDTO;
import com.example.Vaccination.DTO.ResponseDTO.DoctorResponseDTO;
import com.example.Vaccination.exception.DoctorNotFoundException;
import com.example.Vaccination.exception.Dose1NotTakenException;
import com.example.Vaccination.exception.Dose1VaccineNotMatchWithCurrentVaccineTypeException;
import com.example.Vaccination.exception.UserNotFoundException;
import com.example.Vaccination.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
        @Autowired
    AppointmentService appointmentService;
    @PostMapping("/add")
    public ResponseEntity addAppointment(@RequestBody AppointmentRequestDTO appointmentRequestDTO) throws UserNotFoundException, DoctorNotFoundException {
        try{
            AppointmentResponseDTO appointmentResponseDTO=appointmentService.bookAppointment(appointmentRequestDTO);
            return new ResponseEntity(appointmentResponseDTO, HttpStatus.CREATED);
        }
        catch (UserNotFoundException userNotFoundException){
            return new ResponseEntity(userNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
        }
        catch(DoctorNotFoundException doctorNotFoundException){
            return new ResponseEntity(doctorNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
        } catch (Dose1NotTakenException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        } catch (Dose1VaccineNotMatchWithCurrentVaccineTypeException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }
}
