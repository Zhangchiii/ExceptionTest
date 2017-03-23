package com.example.controller;

import com.example.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Ricky on 2017/3/24.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("test1")
    public void test1() {
        testService.test1();
    }

    @RequestMapping("test2")
    public void test2(){
        testService.test2();
    }
}
