package com.example.demo.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);

        //bean1看到的好像是ColorFactoryBean，实际上是Color的bean
        Object bean1 = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println(bean1);
        System.out.println(bean1==bean2);//设置为isSingleton返回值为true时，为单例

        //获取ColorFactoryBean本身
        ColorFactoryBean colorFactoryBean = (ColorFactoryBean) applicationContext.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean);

    }
}
