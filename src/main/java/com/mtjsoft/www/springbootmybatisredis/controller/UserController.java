package com.mtjsoft.www.springbootmybatisredis.controller;

import com.mtjsoft.www.springbootmybatisredis.entity.User;
import com.mtjsoft.www.springbootmybatisredis.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@ResponseBody
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping(value = "/getUserById")
    public User getUserById(@PathParam("id") int id) {
        return userServiceImp.selectByPrimaryKey(id);
    }
}
