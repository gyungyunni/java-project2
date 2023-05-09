package com.example.javaproject2.week4.practice;

public class DeskTop extends Computer{
    @Override
    void display() {
        System.out.println("DeskTop display");
    }
    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }
    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }
}