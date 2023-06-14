package com.atguigu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MVCController {

    @GetMapping("/index")
    public String toIndexPage(Model model){
        model.addAttribute("Account","account");
        return "list";

    }



    @GetMapping("/false")
    @ResponseBody
    public String showFail(){
        System.out.println("这条路径拦截不到！！！");
        return "return AJXS Http";
    }


}
