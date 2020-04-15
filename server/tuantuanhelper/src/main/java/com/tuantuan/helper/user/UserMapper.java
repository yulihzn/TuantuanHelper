package com.tuantuan.helper.user;

import com.tuantuan.helper.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("select * from user order by id desc")
    List<User> getUserList();

    @Insert("insert into user(name,balance,gender,remarks,createTime) values(#{name},#{balance},#{gender},#{remarks},#{createTime})")
    int addUser(User user);

    @Delete("delete from user where name=#{name}")
    int deleteUser(String name);

    @Update("update user set name=#{name},balance=#{balance},gender=#{gender},remarks=#{remarks},updateTime=#{updateTime} where id=#{id}")
    int updateUser(User user);

}
