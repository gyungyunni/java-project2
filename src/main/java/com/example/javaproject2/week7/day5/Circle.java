package com.example.javaproject2.week7.day5;

public class Circle implements Shape {
    private double radius;
    public Circle(double r){
        this.radius = r;
    }
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return PI * radius * 2;
    }
}
