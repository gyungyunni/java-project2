package com.example.javaproject2.week4.day3practice;

// 상속은 구현 코드를 상속 받는 것, 인터페이스는 구현된 코드가 없으므로 클래스가 인터페이스를 구현(implements)
// 추상 메소드가 없는 클래스여도 인터페이스 메서드를 다 구현하지 않으면 추상 클래스가 됨
public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
