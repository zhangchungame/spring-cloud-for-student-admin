package com.dandinglong.adminstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminStudentApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminStudentApp.class,args);
    }
}
