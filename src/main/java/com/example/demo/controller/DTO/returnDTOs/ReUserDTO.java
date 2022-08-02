package com.example.demo.controller.DTO.returnDTOs;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询返回DTO，不过这里想了想还是没用到，以后如果需求变更，或许可以改改用到吧，所以就没删
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
