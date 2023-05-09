package com.example.javaproject2.week4.practice;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("=================");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
