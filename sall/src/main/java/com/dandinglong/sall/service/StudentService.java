package com.dandinglong.sall.service;


import com.dandinglong.sall.config.FeignFallBack;
import com.dandinglong.sall.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "admin-student",fallback = FeignFallBack.class)
public interface StudentService {
    @RequestMapping("/studnet/hello")
    public UserInfo studentHello();
}
