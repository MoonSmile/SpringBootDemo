package com.example.demo.Bean.config;

import com.example.demo.Bean.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("wenke")
@Configuration
public class AppConfigWithInactiveProfile {

    @Bean
    public Subject subject(){
        Subject subject = new Subject();
        subject.setWenke("历史");
        return subject;
    }
}