package com.example.springAutomationFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {

   @Autowired
    private Car mycar;

    public void startCar() {
    mycar.getCar();
    }

    public void enginerOn(){
        System.out.println("Engine Started");
    }
}
