package com.atguigu.boot;


import com.atguigu.boot.entity.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Teacher.class)
public class HelloWorldMainType {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainType.class,args);
    }
}
