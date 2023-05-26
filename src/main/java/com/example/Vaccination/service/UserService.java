package com.example.Vaccination.service;

import com.example.Vaccination.DTO.RequestDTO.UserRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.UserResponseDTO;
import com.example.Vaccination.model.User;

public interface UserService {
    public UserResponseDTO addUser(UserRequestDTO user);
}
