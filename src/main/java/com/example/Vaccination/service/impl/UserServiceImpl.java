package com.example.Vaccination.service.impl;

import com.example.Vaccination.DTO.RequestDTO.UserRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.UserResponseDTO;
import com.example.Vaccination.model.User;
import com.example.Vaccination.repository.UserRepository;
import com.example.Vaccination.service.UserService;
import com.example.Vaccination.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDTO addUser(UserRequestDTO userRequestDTO){
       //convert request dto to entity
//        User user=new User();
//        user.setName(userRequestDTO.getName());
//        user.setAge(userRequestDTO.getAge());
//        user.setEmailId(userRequestDTO.getEmailId());
//        user.setContactNo(userRequestDTO.getMobileNo());
//        user.setGender(userRequestDTO.getGender());

        //create user using builder
        User user= UserTransformer.userRequestDTOToUser(userRequestDTO);

        //save into database
        User savedUser=userRepository.save(user);

        //change entity to responsedto
//        UserResponseDTO userResponseDTO=new UserResponseDTO();
//        userResponseDTO.setName(savedUser.getName());
//        userResponseDTO.setMessage("Congrats!!! user registered successfully");
        UserResponseDTO userResponseDTO= UserTransformer.userToUserResponseDTO(savedUser);
        return userResponseDTO;
    }
}
