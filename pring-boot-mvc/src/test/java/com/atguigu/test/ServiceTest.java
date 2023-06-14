package com.atguigu.test;
import com.atguigu.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private TestService testService;

    @Test
    public void testService(){
        testService.showString();
    }



}
