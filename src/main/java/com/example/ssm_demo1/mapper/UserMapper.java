package com.example.ssm_demo1.mapper;

import com.example.ssm_demo1.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    Userinfo getUserById(@Param("user_id") Integer id);
}
