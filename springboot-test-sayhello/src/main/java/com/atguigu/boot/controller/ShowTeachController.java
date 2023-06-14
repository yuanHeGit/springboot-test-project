package com.atguigu.boot.controller;


import com.atguigu.boot.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowTeachController {


    @Autowired
    private Teacher teacher;


    @GetMapping("/show/teacher")
    public Teacher showTeacher(){
        return teacher;
    }

}
