package com.gyf.test2.service;


import com.gyf.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl {


    @Autowired
   private CustomerMapper customerMapper;

    public void save(String username, String tel) {
        customerMapper.save(username,tel);
    }
}
