package com.mtjsoft.www.springbootmybatisredis.controller;

import com.mtjsoft.www.springbootmybatisredis.entity.User;
import com.mtjsoft.www.springbootmybatisredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getusers")
    public List<User> getUserList() {
        return userService.getAllUser();
    }

    @GetMapping(value = "/getuser")
    public User getUserById(@RequestParam(value = "id")Long id){
        return userService.getUser(id);
    }
}
