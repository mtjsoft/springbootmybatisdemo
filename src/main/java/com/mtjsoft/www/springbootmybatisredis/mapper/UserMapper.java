package com.mtjsoft.www.springbootmybatisredis.mapper;

import com.mtjsoft.www.springbootmybatisredis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getOne(Long id);

    @Insert("INSERT INTO user(username,userpassword) VALUES(#{username}, #{userpassword})")
    void insert(User user);

    @Update("UPDATE user SET username=#{username},userpassword=#{userpassword} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}
