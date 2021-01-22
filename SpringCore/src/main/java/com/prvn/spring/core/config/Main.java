package com.prvn.spring.core.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        AppConfig bean = context.getBean(AppConfig.class);
        bean.manufactureCar();
        bean.manufactureCar();
    }
}
