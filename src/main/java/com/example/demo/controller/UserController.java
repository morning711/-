package com.example.demo.controller;



import com.example.demo.common.Result;
import com.example.demo.controller.DTO.postDTOs.UserDTO;
import com.example.demo.controller.DTO.returnDTOs.ReUserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * 增加用户
     */
    @PostMapping("/AddUser")
    public Result<String> addUser(@RequestBody UserDTO userDTO){
        userService.insertUser(userDTO);
        //没太理解这个error怎么抛出哎，想的是如果上面增加失败返回false就抛error
        return Result.success("新增成功");
    }

    /**
     * 根据id删除用户
     */

    @DeleteMapping("/DeleteUser/{userId}")
    public Result<String> deleteUser(@PathVariable int userId){
        userService.deleteByUserId(userId);
        //没太理解这个error怎么抛出哎，想的是如果上面删除失败返回false就抛error
        return Result.success("删除成功");
    }

    /**
     * 根据userId查找（查找到的是唯一的）
     */
    @GetMapping("/FindUserById/{userId}")
    public Result<User> findByUserId(@PathVariable int userId){
        return Result.success(userService.findByUserId(userId));
    }

    /**
     * 根据userName查找（模糊查找）
     */
    @GetMapping("/FindUserByName/{userName}")
    public Result<List<User>> findByUserName(@PathVariable String userName){
        return Result.success(userService.findByUserName(userName));
    }

    /**
     * 根据userStudyNumber查找（模糊查找)
     */
    @GetMapping("/FindUserByStudyNumber/{userStudyNumber}")
    public Result<List<User>> findByUserStudyNumber(@PathVariable String userStudyNumber){
        return Result.success(userService.findByUserStudyNumber(userStudyNumber));
    }

    /**
     * 根据userPhone查找(模糊查找)
     */
    @GetMapping("/FindUserByPhone/{userPhone}")
    public Result<List<User>> findByUserPhone(@PathVariable String userPhone){
        return Result.success(userService.findByUserPhone(userPhone));
    }

    /**
     * 根据userId修改用户信息
     */
    @PutMapping("/UpdateUser/{userId}")
    public Result<String> updateUser(@PathVariable int userId,@RequestBody UserDTO userDTO){
        userService.updateByUserId(userId,userDTO);
        //没太理解这个error怎么抛出哎，想的是如果上面更新失败返回false就抛error
        return Result.success("更新用户信息成功");
    }

    /**
     * 根据id修改用户状态
     */
    @GetMapping("/ChangeTag")
    public Result<String> changeTag(@RequestParam int userId,@RequestParam int userTag){
       userService.changeTag(userId,userTag);
        //没太理解这个error怎么抛出哎，想的是如果上面更新失败返回false就抛error
       return Result.success("更改状态成功");
    }

    /**
     * 获取全部用户信息
     */
    @GetMapping("/allUser")
    public Result<List<User>> getAll(){
        return Result.success(userService.list());
    }





























}

