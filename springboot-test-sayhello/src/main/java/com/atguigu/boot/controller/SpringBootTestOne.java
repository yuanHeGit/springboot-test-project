package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTestOne {

    @GetMapping("/spring/boot/holle")
    public String sayHolle(){
        return "holle!!!";
    }

}
