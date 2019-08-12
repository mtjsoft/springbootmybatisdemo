package com.mtjsoft.www.springbootmybatisredis.mapper;

import com.mtjsoft.www.springbootmybatisredis.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}