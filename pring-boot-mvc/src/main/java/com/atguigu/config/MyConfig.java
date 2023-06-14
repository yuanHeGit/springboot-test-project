package com.atguigu.config;
import com.atguigu.interceptors.MyInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptors myInterceptors;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // ant 风格地址匹配模式：/*表示匹配请求路径中的一级
        // ant 风格地址匹配模式：/**表示匹配请求路径中的多级
        // /apple/aaa
        // /apple/aaa/bbb
        registry.addInterceptor(myInterceptors).addPathPatterns("/index/**");
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        @GetMapping("/index/one")
//        public String showPortal(){
//            return "portal";
//        }
        registry.addViewController("/index/one").setViewName("portal");
    }

}
