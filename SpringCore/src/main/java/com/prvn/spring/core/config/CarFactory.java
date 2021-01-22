package com.prvn.spring.core.config;

public class CarFactory {
    public CarFactory(Car car) {
        System.out.println("Manufacturing the car : " + car.hashCode());
    }
}
