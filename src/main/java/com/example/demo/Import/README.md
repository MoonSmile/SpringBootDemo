给容器中注册组件；
   1. 包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
   2. @Bean[导入的第三方包里面的组件]
   3. @Import[快速给容器中导入一个组件]

             1)  @Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
             2)  ImportSelector:返回需要导入的组件的全类名数组；
             3) ImportBeanDefinitionRegistrar:手动注册bean到容器中