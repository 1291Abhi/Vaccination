package com.example.Vaccination.controller;

import com.example.Vaccination.DTO.RequestDTO.UserRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.UserResponseDTO;
import com.example.Vaccination.model.User;
import com.example.Vaccination.service.UserService;
import com.example.Vaccination.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    public ResponseEntity addUser(@RequestBody UserRequestDTO user){
        UserResponseDTO savedUser=userService.addUser(user);
        return new ResponseEntity(savedUser, HttpStatus.CREATED);
    }
    //find by emialid

    //update the name of user by given mobile number

    //all the user who have not taken a single dose

    //all the user who have taken dose1 but not dose2

    // all the user who are fully vacinated

    //all the male user who have not taken a single dose

    //all female user who have taken full dose

}
