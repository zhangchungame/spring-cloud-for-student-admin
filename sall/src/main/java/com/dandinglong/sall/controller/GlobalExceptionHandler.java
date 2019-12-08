package com.dandinglong.sall.controller;

import com.dandinglong.sall.entity.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public APIResponse exceptionDeal(HttpServletRequest request, HttpServletResponse response,Exception e){
        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setContentType("application/json;charset=UTF-8");
        APIResponse result=new APIResponse();
        result.setCode(111);
        result.setMsg(e.getMessage());
        return result;
    }
}
