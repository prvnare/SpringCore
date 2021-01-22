package com.prvn.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public CarFactory manufactureCar(){
        return new CarFactory(car());
    }
}
