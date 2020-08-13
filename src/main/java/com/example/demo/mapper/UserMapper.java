package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    UserBean getUser();

    List<UserBean> getUserList();
}

