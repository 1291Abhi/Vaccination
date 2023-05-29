package com.example.Vaccination.service.impl;

import com.example.Vaccination.DTO.RequestDTO.DoctorRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.CenterResponseDTO;
import com.example.Vaccination.DTO.ResponseDTO.DoctorResponseDTO;
import com.example.Vaccination.exception.CenterNotPresentException;
import com.example.Vaccination.model.Doctor;
import com.example.Vaccination.model.VaccinationCenter;
import com.example.Vaccination.repository.CenterRepository;
import com.example.Vaccination.service.DoctorService;
import com.example.Vaccination.service.VaccinationCenterService;
import com.example.Vaccination.transformer.CenterTransformer;
import com.example.Vaccination.transformer.DoctorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    CenterRepository centerRepository;

    @Override
    public DoctorResponseDTO addDoctor(DoctorRequestDTO doctorRequestDTO) throws CenterNotPresentException {
        Optional<VaccinationCenter> optionalCenter=centerRepository.findById(doctorRequestDTO.getCenterId());
        if(!optionalCenter.isPresent()){
            throw new CenterNotPresentException("Center with given ID is not present");
        }
        VaccinationCenter center=optionalCenter.get();
        Doctor doctor= DoctorTransformer.doctorRequestDTOToCenter(doctorRequestDTO);
        doctor.setVaccinationCenter(center);
        //add doctor to current list of doctor in center
        List<Doctor> doctorList=center.getDoctorList();
        doctorList.add(doctor);
        center.setDoctorList(doctorList);
        VaccinationCenter saveCenter=centerRepository.save(center); //saves both doc and center

        CenterResponseDTO centerResponseDTO= CenterTransformer.CenterToCenterResponseDTO(center);
        return DoctorTransformer.centerTODoctorResponseDTO(doctor,centerResponseDTO);

    }
}
