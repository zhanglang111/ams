package com.ams.ams.Controller;

import com.ams.ams.Service.UserloginService;
import com.ams.ams.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserloginContorller {
    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "loginHtml";
    }
    //处理登录逻辑
    @Autowired
    UserloginService userloginService;
    @RequestMapping("/userLogin")
    public String userlogin(String username, String password, HttpServletRequest request){

        User user =userloginService.userlogin(username,password);
        if(user != null){
            return "loginsuccess";
        }else {
            return "loginerror";
        }
    }

    @RequestMapping("/registerpage")
    public String gotoregisterpage(String username, String password, HttpServletRequest request){
        return "register";
    }
}
