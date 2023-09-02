package com.example.homework.service;


import com.example.homework.mapper.UserMapper;
import com.example.homework.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserVo> getUserList() {
        return userMapper.getUserList();
    }
}
