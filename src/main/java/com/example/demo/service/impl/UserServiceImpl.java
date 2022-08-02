package com.example.demo.service.impl;

import com.auth0.jwt.JWT;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.common.Result;
import com.example.demo.controller.DTO.postDTOs.UserDTO;
import com.example.demo.controller.DTO.returnDTOs.ReUserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Always
 * @since 2022-07-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    @Transactional
    public Boolean insertUser(UserDTO userDTO) {
        User user=userDTO.toUser();
        //设置初始密码123456，需要进行md5加密处理
        //设置初始学生权限为2
        user.setUserpassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        user.setUsertag(2);
        return save(user);
    }

    @Override
    @Transactional
    public Boolean deleteByUserId(int userId) {
        return removeById(userId);
    }

    @Override
    public User findByUserId(int userId) {
        User user=getById(userId);
        if (user!=null){
            return user;
        }
        //计划是抛出一个查询不到的业务异常
        return null;
    }

    @Override
    public List<User> findByUserName(String userName) {
        List<User> users=list(new QueryWrapper<User>().like("username",userName));
        if (!users.isEmpty()){
            return users;
        }
        //计划是抛出一个查询不到的业务异常
        return null;

    }

    @Override
    public List<User> findByUserStudyNumber(String userStudyNumber) {
        List<User> users=list(new QueryWrapper<User>().like("userstudynumber",userStudyNumber));
        if (!users.isEmpty()){
            return users;
        }
        //计划是抛出一个查询不到的业务异常
        return null;
    }

    @Override
    public List<User> findByUserPhone(String userPhone) {
        List<User> users=list(new QueryWrapper<User>().like("userPhone",userPhone));
        if (!users.isEmpty()){
            return users;
        }
        //计划是抛出一个查询不到的业务异常
        return null;
    }

    @Override
    @Transactional
    public Boolean updateByUserId(int userId,UserDTO userDTO) {
        User user=userDTO.toUser();
        return update(user,new UpdateWrapper<User>().eq("userid",userId));
    }

    @Override
    @Transactional
    public Boolean changeTag(int userId, int userTag) {
        return updateById(new User(userId,userTag));
    }


}
