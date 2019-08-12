package com.mtjsoft.www.springbootmybatisredis.service;

import com.mtjsoft.www.springbootmybatisredis.entity.User;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
