package com.gyf.web.controller;


import com.gyf.test1.service.UserServiceImpl;
import com.gyf.test2.service.CustomerServiceImpl;
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
    @Autowired
    private CustomerServiceImpl customerService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        //把数据保存到test1数据库
        userService.register(username,password);
        return "success";
    }
}
