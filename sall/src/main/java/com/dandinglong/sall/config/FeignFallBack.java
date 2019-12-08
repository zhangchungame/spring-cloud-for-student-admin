package com.dandinglong.sall.config;

import com.dandinglong.sall.entity.UserInfo;
import com.dandinglong.sall.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements StudentService {
    @Override
    public UserInfo studentHello() {
        return new UserInfo("error","error");
    }
}
