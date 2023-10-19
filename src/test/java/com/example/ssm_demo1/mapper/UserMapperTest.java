package com.example.ssm_demo1.mapper;

import com.example.ssm_demo1.entity.Userinfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 1.表明当前单元测试试运行在Spring Boot环境中的
class UserMapperTest {
    // 2.注入测试对象
    @Autowired
    private UserMapper userMapper;

    @Test
    void getUserById() {
        // 3.添加单元测试的业务代码
        Userinfo userinfo = userMapper.getUserById(1);
        System.out.println(userinfo);
        Assertions.assertEquals("admin",userinfo.getUsername());
    }

    @Test
    void getAllUsers() {
        List<Userinfo> users = userMapper.getAllUsers();
        Assertions.assertEquals(1,users.size());
    }
}