package com.example.demo.FactoryBean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class ColorFactoryBean implements FactoryBean<Color> {

    @Nullable
    @Override
    public Color getObject() throws Exception {
        System.out.println("ImportBeanByFactoryBean...............getObject");
        return new Color();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是否为单例，默认为true，单实例。false表示为多实例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
