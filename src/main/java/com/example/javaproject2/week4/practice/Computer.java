package com.example.javaproject2.week4.practice;

public abstract class  Computer {
    abstract void display();
    abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}