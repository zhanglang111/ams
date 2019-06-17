package com.ams.ams.Service.ServiceImpl;

import com.ams.ams.Service.UserloginService;
import com.ams.ams.entity.User;
import com.ams.ams.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserloginServiceImpl implements UserloginService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User userlogin(String username, String password) {
        return userMapper.userlogin(username,password);
    }
}
