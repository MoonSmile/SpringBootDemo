package com.example.demo.Bean.config;

import com.example.demo.Bean.FirstBean;
import com.example.demo.Bean.SecondBean;
import com.example.demo.Bean.ThirdBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class AppConfigWithDependsOn {
    @Bean("firstBean")
    @DependsOn(value = {
            "secondBean",
            "thirdBean"
    })
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean("secondBean")
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean("thirdBean")
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }
}
