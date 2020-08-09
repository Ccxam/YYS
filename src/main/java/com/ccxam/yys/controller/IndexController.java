package com.ccxam.yys.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/yys")
public class IndexController {
    @GetMapping("/info")
    public String getInfo(){

        return "Hello Yys";
    }
}
