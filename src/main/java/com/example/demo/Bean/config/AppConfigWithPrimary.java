package com.example.demo.Bean.config;

import com.example.demo.Bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfigWithPrimary {

    @Bean
    public MyBean myBeanOne(){
        return new MyBean();
    }

    @Bean
    @Primary
    public MyBean myBeanTwo(){
        return new MyBean();
    }
}