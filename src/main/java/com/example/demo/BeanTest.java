package com.example.demo;

import com.example.demo.Bean.FirstBean;
import com.example.demo.Bean.MyBean;
import com.example.demo.Bean.Subject;
import com.example.demo.Bean.config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    public static void TestPrimary(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithPrimary.class);
        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean);
    }
    public static void TestDependOn(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithDependsOn.class);
        context.getBean(FirstBean.class);
        context.close();
    }
    public static void TestLazy(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithLazy.class);

        // 获取启动过程中的bean 定义的名称
        for(String str : context.getBeanDefinitionNames()){
            System.out.println("str = " + str);
        }
    }
    public static void TestScope() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithAliasAndScope.class);
        MyBean myBean = (MyBean) context.getBean("b1");
        MyBean myBean2 = (MyBean) context.getBean("b2");
        System.out.println(myBean);
        System.out.println(myBean2);
    }
    public static void Test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();//SpringApplication.run(DemoApplication.class, args);
//        context.getBean("myBean");
        // 激活 like 的profile
        context.getEnvironment().setActiveProfiles("like");
        context.register(AppConfigWithActiveProfile.class, AppConfigWithInactiveProfile.class);
        context.refresh();
        Subject subject = (Subject) context.getBean("subject");
        System.out.println("subject = " + subject);
    }
}
