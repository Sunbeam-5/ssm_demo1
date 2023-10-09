package com.example.ssm_demo1.controller;

import com.example.ssm_demo1.entity.Userinfo;
import com.example.ssm_demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value ="/getuserbyid")
    public Userinfo getUserById(Integer id) {
        if (id == null) {
            return null;
        }
        return userService.getUserById(id);
    }
}
