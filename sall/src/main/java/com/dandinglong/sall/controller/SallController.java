package com.dandinglong.sall.controller;

import com.dandinglong.sall.entity.UserInfo;
import com.dandinglong.sall.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sall")
public class SallController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("hello")
    public UserInfo hello(){
        UserInfo userInfo = studentService.studentHello();
        return userInfo;
    }
}
