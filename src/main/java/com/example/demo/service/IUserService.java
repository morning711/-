package com.example.demo.service;

import com.example.demo.controller.DTO.postDTOs.UserDTO;
import com.example.demo.controller.DTO.returnDTOs.ReUserDTO;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Always
 * @since 2022-07-31
 */
public interface IUserService extends IService<User> {
    Integer insertUser(UserDTO userDTO);
    Boolean deleteByUserId(int userId);
    ReUserDTO findByUserId(int userId);
    List<ReUserDTO> findByUserName(String userName);
    List<ReUserDTO> findByUserStudyNumber(String userStudyNumber);
    ReUserDTO findByUserPhone(String userPhone);
    Boolean updateByUserId(int userId,UserDTO userDTO);
    Boolean changeTag(int userId,int userTag);
}
