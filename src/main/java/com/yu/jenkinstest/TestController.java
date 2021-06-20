package com.yu.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ychao
 * @date 2021/4/29 23:25
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        String message = "hello world";
        return message;
    }


}
