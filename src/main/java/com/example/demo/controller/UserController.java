package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/fuck")
    @ResponseBody
    public UserBean getUser() {
        UserBean userBean = userService.getUser();
        return userBean;
    }

    @RequestMapping("/fuckYou")
    @ResponseBody
    public List<UserBean> getUserList() {
        return userService.getUserList();
    }

}
