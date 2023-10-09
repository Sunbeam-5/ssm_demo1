package com.example.ssm_demo1.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Userinfo {
    private int id;
    private String username;
    private String password;
    private String photo;
    private LocalDateTime creattime;
    private LocalDateTime updatetime;
    private int state;
}
