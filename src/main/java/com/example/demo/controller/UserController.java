package com.example.demo.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
//    @Resource
//    UserServiceImpl userService;
//   @PostMapping("/login")
//    public Result login(User user){
//       Integer userid=user.getUserid();
//       User tempuser=userService.getOne(Wrappers.<User>lambdaQuery().eq(User::getUserid,userid));
//       if(tempuser.getUserpassword().equals(user.getUserpassword())){
//           return Result.success();
//       }
//       else return Result.error("0","密码错误");
//   }
}

