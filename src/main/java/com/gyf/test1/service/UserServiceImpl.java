package com.gyf.test1.service;


import com.gyf.test1.mapper.UserMapper;
import com.gyf.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl  {


    @Autowired
   private UserMapper userMapper;
    @Autowired
    private CustomerMapper customerMapper;
    public void register(String username, String password) {
        //Test1下面的事务 只针对 test1下面有效 ,也就是DataSource01 里面指的位置
        //所以 即使中间抛出异常 test2下面的save方法还是会执行。
        customerMapper.save(username,"110");
        //int i=10/0;
        userMapper.save(username,password);
        //故意抛异常


    }
}
