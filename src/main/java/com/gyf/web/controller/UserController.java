package com.gyf.web.controller;


import com.gyf.test1.service.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //声明Rest风格的控制器
//@EnableAutoConfiguration //自动配置，相当于写了spring的配置文件
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        userService.register(username,password);
        return "success";
    }
    @RequestMapping("login")
    @ResponseBody
    public String login(String username,String password){
        return "success";
    }
}
