package com.atguigu.controller;

import com.atguigu.entity.Account;
import com.atguigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/index/data")
    public String showIndex(Model model){
        List<Account> accountList = accountService.findAll();
        model.addAttribute("accountList",accountList);
        return "list";
    }

}
