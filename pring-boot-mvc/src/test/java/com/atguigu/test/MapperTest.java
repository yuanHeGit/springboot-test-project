package com.atguigu.test;
import com.atguigu.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void test01(){
        System.out.println(accountMapper.findAll());
    }
}
