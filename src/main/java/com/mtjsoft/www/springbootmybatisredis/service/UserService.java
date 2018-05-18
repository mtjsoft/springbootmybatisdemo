package com.mtjsoft.www.springbootmybatisredis.service;

import com.mtjsoft.www.springbootmybatisredis.entity.User;
import com.mtjsoft.www.springbootmybatisredis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.getAll();
    }

    public User getUser(Long id){
        return userMapper.getOne(id);
    }
}
