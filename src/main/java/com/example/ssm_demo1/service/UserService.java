package com.example.ssm_demo1.service;

import com.example.ssm_demo1.entity.Userinfo;
import com.example.ssm_demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Userinfo getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
