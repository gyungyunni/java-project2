package com.example.javaproject2.week4.day3practice;
// CompleteCalc에서 구현하지 못한 인터페이스의 남은 메서드를 구현해주면 됨
// 또한 추가적으로 showInfo() 같은 메서드를 만들 수 있음
public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        if( num2 == 0 )
            return ERROR;
        else
            return num1 / num2;
    }
    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }
}
