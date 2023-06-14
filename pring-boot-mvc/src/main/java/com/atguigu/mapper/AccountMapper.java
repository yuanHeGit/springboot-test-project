package com.atguigu.mapper;
import com.atguigu.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface AccountMapper {
    List<Account> findAll();
}
