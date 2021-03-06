package com.ccxam.yys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages = "com.ccxam")
public class YysApplication {
    public static void main(String[] args) {
        SpringApplication.run(YysApplication.class,args);
    }
}
