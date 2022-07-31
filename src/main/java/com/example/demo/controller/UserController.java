package com.example.demo.controller;


import com.example.demo.common.Result;
import com.example.demo.controller.DTO.postDTOs.UserDTO;
import com.example.demo.controller.DTO.returnDTOs.ReUserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Always
 * @since 2022-07-31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * 增加用户
     */
    @PostMapping
    public Result<String> addUser(@RequestBody UserDTO userDTO){
        userService.insertUser(userDTO);
        return Result.success("新增成功");
    }

    /**
     * 根据id删除用户
     */

    @DeleteMapping("{userId}")
    public Result<String> deleteUser(@PathVariable int userId){
        if (userService.deleteByUserId(userId)){
            return Result.success("删除成功");
        }else {
            return Result.error("1","删除失败");//id不存在
        }
    }

    /**
     * 根据userId查找（查找到的是唯一的）
     */
    @GetMapping("/FindUserById/{userId}")
    public Result<ReUserDTO> findByUserId(@PathVariable int userId){
        return Result.success(userService.findByUserId(userId));
    }

    /**
     * 根据userName查找（模糊查找）
     */
    @GetMapping("/FindUserByName/{username}")
    public Result<List<ReUserDTO>> findByUserName(@PathVariable String userName){
        return Result.success(userService.findByUserName(userName));
    }

    /**
     * 根据userStudyNumber查找（模糊查找)
     */
    @GetMapping("/FindUserByStudyNumber/{userStudyNumber}")
    public Result<List<ReUserDTO>> findByUserStudyNumber(@RequestParam String userStudyNumber){
        return Result.success(userService.findByUserStudyNumber(userStudyNumber));
    }

    /**
     * 根据userPhone查找(唯一的)
     */
    @GetMapping("/FindUserByPhone/{userPhone}")
    public Result<ReUserDTO> findByUserPhone(@RequestParam String userPhone){
        return Result.success(userService.findByUserPhone(userPhone));
    }

    /**
     * 根据userId修改用户信息
     */
    @PutMapping("/UpdateUser/{userId}")
    public Result<String> updateUser(@PathVariable int userId,@RequestBody UserDTO userDTO){
        if (userService.updateByUserId(userId,userDTO)){
            return Result.success("更新用户信息成功");
        }else {
            return Result.error("1","更新用户信息失败");
        }
    }

    /**
     * 根据id修改用户状态
     */
    @GetMapping("/ChangeTag")
    public Result<String> changeTag(@RequestParam int userId,@RequestParam int userTag){
        if (userService.changeTag(userId,userTag)){
            return Result.success("更改状态成功");
        }else {
            return Result.error("1","更改状态失败");
        }
    }

    /**
     * 获取全部用户信息
     */
    @GetMapping("/allUser")
    public Result<List<User>> getAll(){
        return new Result<>(userService.list());
    }





























}

