package com.ams.ams.Service;

import com.ams.ams.entity.User;
import com.ams.ams.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserloginService {

    public User userlogin(String username,String password);
}
