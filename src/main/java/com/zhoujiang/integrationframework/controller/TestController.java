package com.zhoujiang.integrationframework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        System.out.println("test");
        return "测试服务是否正常运行";
    }
}
