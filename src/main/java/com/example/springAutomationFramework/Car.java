package com.example.springAutomationFramework;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car() {
        System.out.println("car instantiated");
    }
    public void getCar(){
        System.out.println("Merc Car");
    }
}
