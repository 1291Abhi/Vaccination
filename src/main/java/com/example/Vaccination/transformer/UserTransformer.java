package com.example.Vaccination.transformer;

import com.example.Vaccination.DTO.RequestDTO.UserRequestDTO;
import com.example.Vaccination.DTO.ResponseDTO.UserResponseDTO;
import com.example.Vaccination.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserTransformer {
    public static User userRequestDTOToUser(UserRequestDTO userRequestDTO){

        return User.builder().name(userRequestDTO.getName())
            .age(userRequestDTO.getAge())
            .emailId(userRequestDTO.getEmailId())
            .contactNo(userRequestDTO.getMobileNo())
            .gender(userRequestDTO.getGender()).build();
    }
    public static UserResponseDTO userToUserResponseDTO(User user){
        return UserResponseDTO.builder().name(user.getName())
                .message("Congrats!!! user registered successfully")
                .build();
    }
}
