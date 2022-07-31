package com.example.demo.controller.DTO.postDTOs;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    String userName;

    String userPhone;

    String userStudyNumber;

    public User toUser(){
        User user=new User();
        user.setUsername(userName);
        user.setUserphone(userPhone);
        user.setUserstudynumber(userStudyNumber);
        return user;
    }
}
