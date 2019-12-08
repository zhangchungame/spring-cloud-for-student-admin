package com.dandinglong.adminstudent.controller;

import com.dandinglong.adminstudent.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public UserInfo helloUser(){
        UserInfo userInfo=new UserInfo(port,"zhongbaban");
        return userInfo;
    }
}
