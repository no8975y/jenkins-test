package com.yu.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/**
 * create by: ychao
 * description: 打war包是注释掉启动类，放开下面的方法
 * create time: 2021/6/16 22:13
 */
//public class JenkinsTestApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(JenkinsTestApplication.class, args);
//    }
//
//}

public class JenkinsTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
