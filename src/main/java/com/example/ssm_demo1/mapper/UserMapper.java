package com.example.ssm_demo1.mapper;

import com.example.ssm_demo1.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户ID查询用户信息
     * @param userId
     * @return
     */
    Userinfo getUserById(@Param("userId") Integer userId);   //实际使用的是前面Param里面的内容。

    List<Userinfo> getAllUsers();
}
