package com.example.demo.service.Impl;

import com.example.demo.bean.UserBean;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean getUser() {
        return userMapper.getUser();
    }

    @Override
    public List<UserBean> getUserList() {
        return userMapper.getUserList();
    }
}
