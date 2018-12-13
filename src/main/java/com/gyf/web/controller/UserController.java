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

    Logger logger= Logger.getLogger(UserController.class);

    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
         //记录客户端的请求参数
        logger.info("120.1.1.0输入地址"+"username:"+username+"password:"+password);
        //把数据保存到test1数据库
        userService.register(username,password);
        return "success";
    }
}
