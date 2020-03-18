package com.example.demo.Import;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ Blue.class, Red.class })// @Import导入组件，id默认是组件的全类名
public class MainConfig {

}
