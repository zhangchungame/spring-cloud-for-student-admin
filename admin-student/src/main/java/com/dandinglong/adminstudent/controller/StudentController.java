package com.dandinglong.adminstudent.controller;

import com.dandinglong.adminstudent.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value="/student")
public class StudentController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public UserInfo helloUser() throws Exception {
        System.out.println("hello");
        UserInfo userInfo=new UserInfo(port,"zhongbaban");
        throw new Exception("cuowu ");
//        return userInfo;
    }
}
