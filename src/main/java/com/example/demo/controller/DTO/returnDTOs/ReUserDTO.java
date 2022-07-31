package com.example.demo.controller.DTO.returnDTOs;

import com.example.demo.entity.User;

public class ReUserDTO {

    Integer userId;

    String userName;

    Integer userTag;

    String userPhone;

    String userStudyNumber;

    public ReUserDTO(User user){
        if (user!=null){
            userId=user.getUserid();
            userName=user.getUsername();
            userTag=user.getUsertag();
            userPhone=user.getUserphone();
            userStudyNumber=user.getUserstudynumber();
        }
    }
}
