package com.example.demo.Bean.config;

import com.example.demo.Bean.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("like")
@Configuration
public class AppConfigWithActiveProfile {

    @Bean
    public Subject subject(){
        Subject subject = new Subject();
        subject.setLike("物理");
        return subject;
    }

}